package legal_resource.service;


import legal_resource.dao.Legal_resourceDao;
import legal_resource.domain.Legal_resource;

/**
 * logic functions such as register, login
 * @author Aayush Makharia
 *
 */
public class Legal_resourceService {
	private Legal_resourceDao entity1Dao = new Legal_resourceDao();
	
	/**
	 * register a Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(Legal_resource form) throws Legal_resourceException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		// check the primary key of Entity1
		Legal_resource entity1 = entity1Dao.findByUsername(form.getUsername());
		if(entity1.getUsername()!=null && entity1.getUsername().equals(form.getUsername())) throw new Legal_resourceException("This user name has been registered!");
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
	public void login(Legal_resource form) throws Legal_resourceException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		Legal_resource user = entity1Dao.findByUsername(form.getUsername());
		if(user.getUsername()==null) throw new Legal_resourceException("The user is not in the database");
		
		String password = user.getPassword();
		
		if(password!=null && !password.equals(form.getPassword()))
			throw new Legal_resourceException(" The password is not right");
		
	}
}
