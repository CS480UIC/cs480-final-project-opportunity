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

public class tutoring_serviceServletDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public tutoring_serviceServletDelete() {
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
		tutoring_serviceDao tsDao = new tutoring_serviceDao();
		tutoring_service ts = null;
		if(method.equals("search"))
		{
			try {
				ts = tsDao.findByServiceAndUserId(Integer.parseInt(request.getParameter("service_id")), Integer.parseInt(request.getParameter("user_id")));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
		
			if(ts.getServiceId()!=null && ts.getUserId() != null){
						System.out.println(ts);
						request.setAttribute("tutoring_service", ts);
						request.getRequestDispatcher("/jsps/tutoring_service/tutoring_service_delete_output.jsp").forward(request, response);			
				}
				else{
				request.setAttribute("msg", "Tutoring Service not found");
				request.getRequestDispatcher("/jsps/tutoring_service/tutoring_service_read_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("delete"))
		{	
			try {
				tsDao.delete(request.getParameter("serviceId"), request.getParameter("userId"));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			request.setAttribute("msg", "Tutoring Service Deleted");
			request.getRequestDispatcher("/jsps/tutoring_service/tutoring_service_read_output.jsp").forward(request, response);
		}
	}
}



