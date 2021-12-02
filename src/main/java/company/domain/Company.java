package company.domain;

/**
 * Company object
 * 
 * @author Rohith Rajan
 * 
 */
public class Company {
	/*
	 * Correspond to the user table
	 */
	
	private int company_id;
	private String name; 
	private String industry;
	private String comp_address;
	private String review;
	/**
	 * @return the company_id
	 */
	public int getCompany_id() {
		return company_id;
	}
	/**
	 * @param company_id the company_id to set
	 */
	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the industry
	 */
	public String getIndustry() {
		return industry;
	}
	/**
	 * @param industry the industry to set
	 */
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	/**
	 * @return the comp_address
	 */
	public String getComp_address() {
		return comp_address;
	}
	/**
	 * @param comp_address the comp_address to set
	 */
	public void setComp_address(String comp_address) {
		this.comp_address = comp_address;
	}
	/**
	 * @return the review
	 */
	public String getReview() {
		return review;
	}
	/**
	 * @param review the review to set
	 */
	public void setReview(String review) {
		this.review = review;
	}
}
	
	
	
	 
	
	 