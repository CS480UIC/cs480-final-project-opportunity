package tutor.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tutor.dao.TutorDao;
import tutor.domain.Tutor;


/**
 * Servlet implementation class UserServlet
 */

public class TutorServletDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TutorServletDelete() {
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
						System.out.println(tutor);
						request.setAttribute("tutor", tutor);
						request.getRequestDispatcher("/jsps/tutor/tutor_delete_output.jsp").forward(request, response);			
				}
				else{
				request.setAttribute("msg", "Tutor not found");
				request.getRequestDispatcher("/jsps/tutor/tutor_read_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("delete"))
		{	
			try {
				tutorDao.delete(Integer.parseInt(request.getParameter("tutorId")));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			request.setAttribute("msg", "Tutor Deleted");
			request.getRequestDispatcher("/jsps/tutor/tutor_read_output.jsp").forward(request, response);
		}
	}
}



