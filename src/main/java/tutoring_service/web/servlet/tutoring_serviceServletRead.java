package tutoring_service.web.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tutoring_service.dao.tutoring_serviceDao;
import tutoring_service.domain.tutoring_service;


/**
 * Servlet implementation class UserServlet
 */

public class tutoring_serviceServletRead extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public tutoring_serviceServletRead() {
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
		tutoring_service ts = null;
		tutoring_serviceDao tsDao = new tutoring_serviceDao();
		
		try {
			ts = tsDao.findByServiceAndUserId(Integer.parseInt(request.getParameter("serviceId")), Integer.parseInt(request.getParameter("userId")));
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		}
		
		if((ts.getServiceId()!=null) && (ts.getUserId() != null)){
					System.out.println(ts);
					request.setAttribute("tutoring_service", ts);
					request.getRequestDispatcher("/jsps/tutoring_service/tutoring_service_read_output.jsp").forward(request, response);
			}
			else{
			request.setAttribute("msg", "Tutoring Service not found");
			request.getRequestDispatcher("/jsps/tutoring_service/tutoring_service_read_output.jsp").forward(request, response);
		}
	}
}



