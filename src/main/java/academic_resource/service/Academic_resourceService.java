package academic_resource.service;


import academic_resource.dao.Academic_resourceDao;
import academic_resource.domain.Academic_resource;

/**
 * logic functions such as register, login
 * @author Aayush Makharia
 *
 */
public class Academic_resourceService {
	private Academic_resourceDao entity1Dao = new Academic_resourceDao();
	
	/**
	 * register a Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(Academic_resource form) throws Academic_resourceException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		// check the primary key of Entity1
		Academic_resource entity1 = entity1Dao.findByUsername(form.getUsername());
		if(entity1.getUsername()!=null && entity1.getUsername().equals(form.getUsername())) throw new Academic_resourceException("This user name has been registered!");
		entity1Dao.add(form);
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
	public void login(Academic_resource form) throws Academic_resourceException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		Academic_resource user = entity1Dao.findByUsername(form.getUsername());
		if(user.getUsername()==null) throw new Academic_resourceException("The user is not in the database");
		
		String password = user.getPassword();
		
		if(password!=null && !password.equals(form.getPassword()))
			throw new Academic_resourceException(" The password is not right");
		
	}
}
