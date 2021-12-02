package job_opportunity.service;


import job_opportunity.dao.JobOpportunityDao;
import job_opportunity.domain.JobOpportunity;

/**
 * logic functions such as register, login
 * @author Aayush Makharia
 *
 */
public class JobOpportunityService {
	private JobOpportunityDao jobDao = new JobOpportunityDao();
	
	/**
	 * register a Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(JobOpportunity form) throws JobOpportunityException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		// check the primary key of Entity1
		JobOpportunity job = jobDao.findByJobAndUserID(form.getJobID(), form.getUserID());
		if( (job.getJobID() == form.getJobID()) && (job.getUserID() == form.getUserID())) throw new JobOpportunityException("This job opportunity has already been registered!");
		jobDao.add(form);
	}
}
