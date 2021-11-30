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

import tutor.domain.Tutor;
import tutor.service.TutorException;
import tutor.service.TutorService;


/**
 * Servlet implementation class UserServlet
 */

public class TutorServletCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TutorServletCreate() {
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
		TutorService tutorService = new TutorService();
		Map<String,String[]> paramMap = request.getParameterMap();
		Tutor form = new Tutor();
		List<String> info = new ArrayList<String>();

		for(String name : paramMap.keySet()) {
			String[] values = paramMap.get(name);
			info.add(values[0]);
		}
		form.setTutor_id(Integer.parseInt(info.get(0)));
		form.setFull_name(info.get(1));
		form.setGrade_level(Integer.parseInt(info.get(2)));
		form.setSubject(info.get(3));
		form.setFee(Double.parseDouble(info.get(4)));
		form.setService_id(Integer.parseInt(info.get(5)));
		form.setPhone_number(info.get(6));
		form.setTutor_hours(info.get(7));
		
		try {
			tutorService.create(form);
			response.sendRedirect( request.getContextPath() + "/jsps/main.jsp");
			
		} catch (ClassNotFoundException | TutorException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} 
		
	}

}
