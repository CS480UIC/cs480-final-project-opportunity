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

import job_opportunity.dao.JobOpportunityDao;
import job_opportunity.domain.JobOpportunity;

/**
 * Servlet implementation class UserServlet
 */

public class JobOpportunityServletUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public JobOpportunityServletUpdate() {
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
		JobOpportunityDao jobDao = new JobOpportunityDao();
		JobOpportunity job = null;

		if(method.equals("search"))
		{
			try {
				job = jobDao.findByJobAndUserID(Integer.parseInt(request.getParameter("jobID")), Integer.parseInt(request.getParameter("userID")));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}

			if((job.getJobID() != 0) && (job.getUserID() != 0)){
				request.setAttribute("job", job);
				request.getRequestDispatcher("/jsps/job_opportunity/job_opportunity_update_output.jsp").forward(request, response);

			}
			else{
				request.setAttribute("msg", "Entity not found");
				request.getRequestDispatcher("/jsps/job_opportunity/job_opportunity_read_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("update"))
		{
			Map<String,String[]> paramMap = request.getParameterMap();
			JobOpportunity form = new JobOpportunity();
			List<String> info = new ArrayList<String>();

			for(String name : paramMap.keySet()) {
				String[] values = paramMap.get(name);
				info.add(values[0]);
			}
			
			form.setJobID(Integer.parseInt(info.get(1)));
			form.setUserID(Integer.parseInt(info.get(2)));
			form.setCompanyID(Integer.parseInt(info.get(3)));
			form.setPositionTitle(info.get(4));
			form.setSalary(Float.parseFloat(info.get(5)));
			form.setJobDescription(info.get(6));
			form.setBenefitDescription(info.get(7));
			form.setApplicationInfo(info.get(8));	

			try {
				jobDao.update(form);

			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			request.setAttribute("msg", "Job Updated");
			request.getRequestDispatcher("/jsps/job_opportunity/job_opportunity_read_output.jsp").forward(request, response);
		}
	}
}



