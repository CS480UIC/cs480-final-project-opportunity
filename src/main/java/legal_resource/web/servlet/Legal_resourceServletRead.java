package legal_resource.web.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import legal_resource.dao.Legal_resourceDao;
import legal_resource.domain.Legal_resource;


/**
 * Servlet implementation class UserServlet
 */

public class Legal_resourceServletRead extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Legal_resourceServletRead() {
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
		Legal_resource lr = null;
		Legal_resourceDao lrDao = new Legal_resourceDao();
		
		try {
			lr = lrDao.findByLegalIDAndUserID(Integer.parseInt(request.getParameter("legal_id")), Integer.parseInt(request.getParameter("user_id")));
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		}
		
		if(lr.getLegal_id()!=null && lr.getUser_id()!=null){
					System.out.println(lr);
					request.setAttribute("legal_resource", lr);
					request.getRequestDispatcher("/jsps/legal_resource/legal_resource_read_output.jsp").forward(request, response);
			}
			else{
			request.setAttribute("msg", "Entity not found");
			request.getRequestDispatcher("/jsps/legal_resource/legal_resource_read_output.jsp").forward(request, response);
		}
	}
}



