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

public class TutorServletRead extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TutorServletRead() {
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
		Tutor tutor = null;
		TutorDao tutorDao = new TutorDao();
		
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
					request.getRequestDispatcher("/jsps/tutor/tutor_read_output.jsp").forward(request, response);
			}
			else{
			request.setAttribute("msg", "Tutor not found");
			request.getRequestDispatcher("/jsps/tutor/tutor_read_output.jsp").forward(request, response);
		}
	}
}



