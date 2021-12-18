package legal_resource.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import legal_resource.dao.Legal_resourceDao;
import legal_resource.domain.Legal_resource;

/**
 * Servlet implementation class UserServlet
 */

public class Legal_resourceServletUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Legal_resourceServletUpdate() {
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
		Legal_resourceDao lrdao = new Legal_resourceDao();
		Legal_resource lr = null;

		if(method.equals("search"))
		{
			try {
				lr = lrdao.findByLegalIDAndUserID(Integer.parseInt(request.getParameter("legalId")), Integer.parseInt(request.getParameter("userId")));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}

			if(lr.getLegal_id()!=null && lr.getUser_id()!=null){
				request.setAttribute("legal_resource", lr);
				request.getRequestDispatcher("/jsps/legal_resource/legal_resource_update_output.jsp").forward(request, response);

			}
			else{
				request.setAttribute("msg", "Legal Resource not found");
				request.getRequestDispatcher("/jsps/legal_resource/legal_resource_read_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("update"))
		{
			Map<String,String[]> paramMap = request.getParameterMap();
			Legal_resource form = new Legal_resource();
			List<String> info = new ArrayList<String>();

			for(String name : paramMap.keySet()) {
				String[] values = paramMap.get(name);
				info.add(values[0]);
			}
			form.setLegal_id(Integer.parseInt(request.getParameter("legalId")));
			form.setUser_id(Integer.parseInt(request.getParameter("userId")));
			form.setCost(Double.parseDouble(info.get(3)));
			form.setLegal_description(info.get(4));
			form.setResource_location(info.get(5));
			form.setResource_name(info.get(6));
			form.setContact_information(info.get(7));
			

			try {
				lrdao.update(form);

			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			request.setAttribute("msg", "Legal Resource Updated");
			request.getRequestDispatcher("/jsps/legal_resource/legal_resource_read_output.jsp").forward(request, response);
		}
	}
}


