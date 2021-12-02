package company.service;


import company.dao.CompanyDao;
import company.domain.Company;

/**
 * logic functions such as register, login
 * @author Rohith Rajan
 *
 */
public class CompanyService {
	private CompanyDao companyDao = new CompanyDao();
	
	
	/**
	 * register a Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(Company form) throws CompanyException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		// check the primary key of Entity1
		Company company = companyDao.findByCompanyID(form.getCompany_id());
		if(company.getCompany_id()!=0 && company.getCompany_id() == form.getCompany_id()) throw new CompanyException("[ERROR]: This companyID has been registered already!");
		companyDao.add(form);
		
	}
}
