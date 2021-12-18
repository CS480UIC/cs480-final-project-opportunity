package legal_resource.service;


import java.util.List;

import legal_resource.dao.Legal_resourceDao;
import legal_resource.domain.Legal_resource;

/**
 * logic functions such as register, login
 * @author Christina Wen
 *
 */

public class Legal_resourceService {
	private Legal_resourceDao lrDao = new Legal_resourceDao();
	
	/**
	 * register a Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(Legal_resource form) throws Legal_resourceException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		// check the primary key of legal_resource
		Legal_resource lr = lrDao.findByLegalIDAndUserID(form.getLegal_id(), form.getUser_id());
		if(lr.getLegal_description()!=null && lr.getLegal_id().equals(form.getLegal_id()) && lr.getUser_id().equals(form.getUser_id())) throw new Legal_resourceException("This user name has been registered!");
		lrDao.add(form);
	}

	
	public List<Object> findAllUserAndLR() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return lrDao.findAllUserLR();
		
	}
	
}