package tutor.service;


import tutor.dao.TutorDao;
import tutor.domain.Tutor;

/**
 * logic functions such as register, login
 * @author Jessica Borowy
 *
 */
public class TutorService {
	private TutorDao tutorDao = new TutorDao();
	
	/**
	 * register a Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(Tutor form) throws TutorException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		// check the primary key of Entity1
		Tutor tutor = tutorDao.findByID(form.getTutor_id());
		if(tutor.getTutor_id() == form.getTutor_id()) throw new TutorException("This tutor has been registered!");
		tutorDao.add(form);
	}
	
}
