package academic_resource.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import academic_resource.dao.Academic_resourceDao;
import academic_resource.domain.Academic_resource;


/**
 * Servlet implementation class UserServlet
 */

public class Academic_resourceServletDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Academic_resourceServletDelete() {
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
		Academic_resourceDao arDao = new Academic_resourceDao();
		Academic_resource ar = null;
		if(method.equals("search"))
		{
			try {
				ar = arDao.findByAcadAndUserID(Integer.parseInt(request.getParameter("academic_id")), Integer.parseInt(request.getParameter("user_id")));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
		
			if(ar.getAcademic_id()!=null && ar.getUser_id()!=null){
						System.out.println(ar);
						request.setAttribute("academic_resource", ar);
						request.getRequestDispatcher("/jsps/academic_resource/academic_resource_delete_output.jsp").forward(request, response);			
				}
				else{
				request.setAttribute("msg", "Academic Resource not found");
				request.getRequestDispatcher("/jsps/academic_resource/academic_resource_read_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("delete"))
		{	
			try {
				arDao.delete(request.getParameter("academic_id"), request.getParameter("user_id"));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			request.setAttribute("msg", "Academic Resource Deleted");
			request.getRequestDispatcher("/jsps/academic_resource/academic_resource_read_output.jsp").forward(request, response);
		}
	}
}



