package tutor.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tutor.dao.TutorDao;
import tutor.domain.Tutor;

/**
 * Servlet implementation class UserServlet
 */

public class TutorServletUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TutorServletUpdate() {
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
		TutorDao tutorDao = new TutorDao();
		Tutor tutor = null;

		if(method.equals("search"))
		{
			try {
				tutor = tutorDao.findByID(Integer.parseInt(request.getParameter("tutorId")));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}

			if(tutor.getTutor_id()!=0){
				request.setAttribute("tutor", tutor);
				request.getRequestDispatcher("/jsps/tutor/tutor_update_output.jsp").forward(request, response);

			}
			else{
				request.setAttribute("msg", "Tutor not found");
				request.getRequestDispatcher("/jsps/tutor/tutor_read_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("update"))
		{
			Map<String,String[]> paramMap = request.getParameterMap();
			Tutor form = new Tutor();
			List<String> info = new ArrayList<String>();

			for(String name : paramMap.keySet()) {
				String[] values = paramMap.get(name);
				info.add(values[0]);
			}
			form.setFull_name(info.get(2));
			form.setGrade_level(Integer.parseInt(info.get(3)));
			form.setSubject(info.get(4));
			form.setFee(Double.parseDouble(info.get(5)));
			form.setService_id(Integer.parseInt(info.get(6)));
			form.setPhone_number(info.get(7));
			form.setTutor_hours(info.get(8));
			form.setTutor_id(Integer.parseInt(request.getParameter("tutorId")));

			try {
				tutorDao.update(form);

			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			request.setAttribute("msg", "Tutor Updated");
			request.getRequestDispatcher("/jsps/tutor/tutor_read_output.jsp").forward(request, response);
		}
	}
}



