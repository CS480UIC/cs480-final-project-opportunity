package job_opportunity.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import job_opportunity.domain.JobOpportunity;
import job_opportunity.service.JobOpportunityException;
import job_opportunity.service.JobOpportunityService;


/**
 * Servlet implementation class UserServlet
 */

public class JobOpportunityServletCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JobOpportunityServletCreate() {
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
		JobOpportunityService jobService = new JobOpportunityService();
		Map<String,String[]> paramMap = request.getParameterMap();
		JobOpportunity form = new JobOpportunity();
		List<String> info = new ArrayList<String>();

		for(String name : paramMap.keySet()) {
			String[] values = paramMap.get(name);
			info.add(values[0]);
		}
		
		form.setJobID(Integer.parseInt(info.get(0)));
		form.setUserID(Integer.parseInt(info.get(1)));
		form.setCompanyID(Integer.parseInt(info.get(2)));
		form.setPositionTitle(info.get(3));
		form.setSalary(Float.parseFloat(info.get(4)));
		form.setJobDescription(info.get(5));
		form.setBenefitDescription(info.get(6));
		form.setApplicationInfo(info.get(7));		
		
		try {
			jobService.create(form);
			response.sendRedirect( request.getContextPath() + "/jsps/main.jsp");
			
		} catch (ClassNotFoundException | JobOpportunityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} 
		
	}

}
