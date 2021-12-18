package job_opportunity.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import job_opportunity.dao.JobOpportunityDao;
import job_opportunity.domain.JobOpportunity;


/**
 * Servlet implementation class UserServlet
 */

public class JobOpportunityServletDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JobOpportunityServletDelete() {
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
		
			if ((job.getJobID()!=0) && (job.getUserID() != 0)){
						System.out.println(job);
						request.setAttribute("job", job);
						request.getRequestDispatcher("/jsps/job_opportunity/job_opportunity_delete_output.jsp").forward(request, response);			
				}
				else{
				request.setAttribute("msg", "Entity not found");
				request.getRequestDispatcher("/jsps/job_opportunity/job_opportunity_read_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("delete"))
		{	
			try {
				jobDao.delete(Integer.parseInt(request.getParameter("jobID")), Integer.parseInt(request.getParameter("userID")));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			request.setAttribute("msg", "Job Deleted");
			request.getRequestDispatcher("/jsps/job_opportunity/job_opportunity_read_output.jsp").forward(request, response);
		}
	}
}



