package health_resources.service;


import health_resources.dao.Health_ResourcesDao;
import health_resources.domain.Health_Resources;

/**
 * logic functions such as register, login
 * @author Bhavana Radharapu
 *
 */
public class Health_ResourcesService {
	private Health_ResourcesDao health_resourceDao = new Health_ResourcesDao();
	
	/**
	 * register a Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(Health_Resources form) throws Health_ResourcesException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		// check the primary key of Entity1
		Health_Resources entity1 = health_resourceDao.findByHealth_id(form.getHealth_id());
		if(entity1.getHealth_id()!=null && entity1.getHealth_id()==(form.getHealth_id())) throw new Health_ResourcesException("This health_resorce has been registered!");
		health_resourceDao.add(form);
	}
	/**
	 * Login function
	 * @param form
	 * @return
	 * @throws UserException 
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
//	public void login(Health_Resources form) throws Health_ResourcesException, ClassNotFoundException, InstantiationException, IllegalAccessException {
//		Health_Resources user = health_resourceDao.findByCompanyID(form.getUsername());
//		if(user.getUsername()==null) throw new Health_ResourcesException("The user is not in the database");
//		
//		String password = user.getPassword();
//		
//		if(password!=null && !password.equals(form.getPassword()))
//			throw new Health_ResourcesException(" The password is not right");
//		
//	}
}
