package tutoring_service.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tutoring_service.dao.tutoring_serviceDao;
import tutoring_service.domain.tutoring_service;

/**
 * Servlet implementation class UserServlet
 */

public class tutoring_serviceServletUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public tutoring_serviceServletUpdate() {
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
		tutoring_serviceDao tsdao = new tutoring_serviceDao();
		tutoring_service ts = null;

		if(method.equals("search"))
		{
			try {
				ts = tsdao.findByServiceAndUserId(Integer.parseInt(request.getParameter("serviceId")), Integer.parseInt(request.getParameter("userId")));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}

			if((ts.getServiceId()!=null) && (ts.getUserId()!=null)){
				request.setAttribute("tutoring_service", ts);
				request.getRequestDispatcher("/jsps/tutoring_service/tutoring_service_update_output.jsp").forward(request, response);

			}
			else{
				request.setAttribute("msg", "Tutoring Service not found");
				request.getRequestDispatcher("/jsps/tutoring_service/tutoring_service_read_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("update"))
		{
			Map<String,String[]> paramMap = request.getParameterMap();
			tutoring_service form = new tutoring_service();
			List<String> info = new ArrayList<String>();

			for(String name : paramMap.keySet()) {
				String[] values = paramMap.get(name);
				info.add(values[0]);
			}
			form.setService_name(info.get(3));
			form.setAddress(info.get(4));
			form.setTotal_tutors(Integer.parseInt(info.get(5)));
			form.setOperation_hours(info.get(6));
			form.setContact_info(info.get(7));
			form.setServiceId(Integer.parseInt(request.getParameter("serviceId")));
			form.setUserId(Integer.parseInt(request.getParameter("userId")));

			try {
				tsdao.update(form);

			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			request.setAttribute("msg", "Tutoring Service Updated");
			request.getRequestDispatcher("/jsps/tutoring_service/tutoring_service_read_output.jsp").forward(request, response);
		}
	}
}



