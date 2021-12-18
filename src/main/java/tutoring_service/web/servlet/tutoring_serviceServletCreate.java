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

import tutoring_service.domain.tutoring_service;
import tutoring_service.service.tutoring_serviceException;
import tutoring_service.service.tutoring_serviceService;


/**
 * Servlet implementation class UserServlet
 */

public class tutoring_serviceServletCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public tutoring_serviceServletCreate() {
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
		tutoring_serviceService tsService = new tutoring_serviceService();
		Map<String,String[]> paramMap = request.getParameterMap();
		tutoring_service form = new tutoring_service();
		List<String> info = new ArrayList<String>();

		for(String name : paramMap.keySet()) {
			String[] values = paramMap.get(name);
			info.add(values[0]);
		}
		form.setServiceId(Integer.parseInt(info.get(0)));
		form.setUserId(Integer.parseInt(info.get(1)));
		form.setService_name(info.get(2));
		form.setAddress(info.get(3));
		form.setTotal_tutors(Integer.parseInt(info.get(4)));
		form.setOperation_hours(info.get(5));
		form.setContact_info(info.get(6));
		
		try {
			tsService.create(form);
			response.sendRedirect( request.getContextPath() + "/jsps/main.jsp");
			
		} catch (ClassNotFoundException | tutoring_serviceException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} 
		
	}

}
