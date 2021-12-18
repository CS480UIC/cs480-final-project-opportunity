package academic_resource.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import academic_resource.dao.Academic_resourceDao;
import academic_resource.domain.Academic_resource;

/**
 * Servlet implementation class UserServlet
 */

public class Academic_resourceServletUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Academic_resourceServletUpdate() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String method = request.getParameter("method");
		Academic_resourceDao ardao = new Academic_resourceDao();
		Academic_resource ar = null;

		if(method.equals("search"))
		{
			try {
				System.out.println("acad update acadID: "+ Integer.parseInt(request.getParameter("academicId")));
				System.out.println("acad update userID: "+ Integer.parseInt(request.getParameter("userId")));
				ar = ardao.findByAcadAndUserID(Integer.parseInt(request.getParameter("academicId")), Integer.parseInt(request.getParameter("userId")));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}

			if(ar.getAcademic_id()!=null && ar.getUser_id()!=null){
				request.setAttribute("academic_resource", ar);
				request.getRequestDispatcher("/jsps/academic_resource/academic_resource_update_output.jsp").forward(request, response);

			}
			else{
				request.setAttribute("msg", "Academic Resource not found");
				request.getRequestDispatcher("/jsps/academic_resource/academic_resource_read_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("update"))
		{
			Map<String,String[]> paramMap = request.getParameterMap();
			Academic_resource form = new Academic_resource();
			List<String> info = new ArrayList<String>();

			for(String name : paramMap.keySet()) {
				String[] values = paramMap.get(name);
				info.add(values[0]);
			}
			
			form.setAcademic_id(Integer.parseInt(request.getParameter("academicId")));
			form.setUser_id(Integer.parseInt(request.getParameter("userId")));
			form.setTitle(info.get(3));
			form.setPayment_cost(Double.parseDouble(info.get(4)));
			form.setAcad_subject(info.get(5));
			form.setAcademic_description(info.get(6));
			form.setAcad_location(info.get(7));

			try {
				ardao.update(form);

			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			request.setAttribute("msg", "Academic Resource Updated");
			request.getRequestDispatcher("/jsps/academic_resource/academic_resource_read_output.jsp").forward(request, response);
		}
	}
}



