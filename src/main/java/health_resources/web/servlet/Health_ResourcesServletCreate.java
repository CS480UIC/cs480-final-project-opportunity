package health_resources.web.servlet;

import java.io.IOException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import health_resources.domain.Health_Resources;
import health_resources.service.Health_ResourcesException;
import health_resources.service.Health_ResourcesService;


/**
 * Servlet implementation class UserServlet
 */

public class Health_ResourcesServletCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Health_ResourcesServletCreate() {
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
		Health_ResourcesService entity1service = new Health_ResourcesService();
		Map<String,String[]> paramMap = request.getParameterMap();
		Health_Resources form = new Health_Resources();
		List<String> info = new ArrayList<String>();

		for(String name : paramMap.keySet()) {
			String[] values = paramMap.get(name);
			info.add(values[0]);
		}
		form.setHealth_id(Integer.parseInt(info.get(0)));
		form.setUser_id(Integer.parseInt(info.get(1)));
		form.setContact(info.get(2));
		form.setHealth_type(info.get(3));
		form.setLocation(info.get(4));
		form.setService_description(info.get(5));	
		form.setPayment(info.get(6));	
		
		
		try {
			entity1service.create(form);
			response.sendRedirect( request.getContextPath() + "/jsps/main.jsp");
			
		} catch (ClassNotFoundException | Health_ResourcesException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} 
		
	}

}
