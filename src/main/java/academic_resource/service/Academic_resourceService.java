package academic_resource.service;


import java.util.List;

import academic_resource.dao.Academic_resourceDao;
import academic_resource.domain.Academic_resource;

/**
 * logic functions such as register, login
 * @author Christina Wen
 *
 */
public class Academic_resourceService {
	private Academic_resourceDao arDao = new Academic_resourceDao();
	
	/**
	 * register a Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(Academic_resource form) throws Academic_resourceException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		// check the primary key of Entity1
		Academic_resource ar = arDao.findByAcadAndUserID(form.getAcademic_id(), form.getUser_id());
		if(ar.getTitle()!=null && ar.getAcademic_id().equals(form.getAcademic_id()) && ar.getUser_id().equals(form.getUser_id())) throw new Academic_resourceException("This user name has been registered!");
		arDao.add(form);
	}
	
	public List<Object> ARUserList() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return arDao.findall();
		
	}

}