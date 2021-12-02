package legal_resource.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import legal_resource.domain.Legal_resource;
import legal_resource.service.Legal_resourceException;
import legal_resource.service.Legal_resourceService;


/**
 * Servlet implementation class UserServlet
 */

public class Legal_resourceServletCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Legal_resourceServletCreate() {
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
		Legal_resourceService lrService = new Legal_resourceService();
		Map<String,String[]> paramMap = request.getParameterMap();
		Legal_resource form = new Legal_resource();
		List<String> info = new ArrayList<String>();

		for(String name : paramMap.keySet()) {
			String[] values = paramMap.get(name);
			info.add(values[0]);
		}
		form.setLegal_id(Integer.parseInt(info.get(0)));
		form.setUser_id(Integer.parseInt(info.get(1)));
		form.setCost(Double.parseDouble(info.get(2)));
		form.setLegal_description(info.get(3));
		form.setResource_location(info.get(4));
		form.setResource_name(info.get(5));
		form.setContact_information(info.get(6));		
		
		try {
			lrService.create(form);
			response.sendRedirect( request.getContextPath() + "/jsps/main.jsp");
			
		} catch (ClassNotFoundException | Legal_resourceException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} 
		
	}

}
