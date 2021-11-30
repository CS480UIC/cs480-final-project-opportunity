package tutoring_service.service;


import tutoring_service.dao.tutoring_serviceDao;
import tutoring_service.domain.tutoring_service;

/**
 * logic functions such as register, login
 * @author Jessica Borowy
 *
 */
public class tutoring_serviceService {
	private tutoring_serviceDao tsDao = new tutoring_serviceDao();
	
	/**
	 * register a Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(tutoring_service form) throws tutoring_serviceException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		// check the primary key of tutoring_service
		tutoring_service ts = tsDao.findByServiceAndUserId(form.getServiceId(), form.getUserId());
		if(ts.getService_name()!=null && ts.getServiceId().equals(form.getServiceId()) && ts.getUserId().equals(form.getUserId())) throw new tutoring_serviceException("This service name has been registered with the given service and user id!");
		tsDao.add(form);
	}
	
}
