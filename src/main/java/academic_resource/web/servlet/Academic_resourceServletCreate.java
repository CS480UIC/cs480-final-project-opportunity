package academic_resource.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import academic_resource.domain.Academic_resource;
import academic_resource.service.Academic_resourceException;
import academic_resource.service.Academic_resourceService;


/**
 * Servlet implementation class UserServlet
 */

public class Academic_resourceServletCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Academic_resourceServletCreate() {
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
		Academic_resourceService arService = new Academic_resourceService();
		Map<String,String[]> paramMap = request.getParameterMap();
		Academic_resource form = new Academic_resource();
		List<String> info = new ArrayList<String>();

		for(String name : paramMap.keySet()) {
			String[] values = paramMap.get(name);
			info.add(values[0]);
		}
		form.setAcademic_id(Integer.parseInt(info.get(0)));
		form.setUser_id(Integer.parseInt(info.get(1)));
		form.setTitle(info.get(2));
		form.setPayment_cost(Double.parseDouble(info.get(3)));
		form.setAcad_subject(info.get(4));
		form.setAcademic_description(info.get(5));
		form.setAcad_location(info.get(6));
		
		try {
			arService.create(form);
			response.sendRedirect( request.getContextPath() + "/jsps/main.jsp");
			
		} catch (ClassNotFoundException | Academic_resourceException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} 
		
	}

}