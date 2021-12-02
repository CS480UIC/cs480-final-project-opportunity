package legal_resource.domain;

/**
 * User object
 * 
 * @author Christina Wen
 * 
 */
public class Legal_resource {
	/*
	 * Correspond to the user table
	 */
	
	private Integer legal_id;
	private Integer user_id;
	private double cost;
	private String legal_description;
	private String resource_location;
	private String resource_name;
	private String contact_information;
	/**
	 * @return the legal_id
	 */
	public Integer getLegal_id() {
		return legal_id;
	}
	/**
	 * @param legal_id the legal_id to set
	 */
	public void setLegal_id(Integer legal_id) {
		this.legal_id = legal_id;
	}
	/**
	 * @return the user_id
	 */
	public Integer getUser_id() {
		return user_id;
	}
	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}
	/**
	 * @param cost the cost to set
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}
	/**
	 * @return the legal_description
	 */
	public String getLegal_description() {
		return legal_description;
	}
	/**
	 * @param legal_description the legal_description to set
	 */
	public void setLegal_description(String legal_description) {
		this.legal_description = legal_description;
	}
	/**
	 * @return the resource_location
	 */
	public String getResource_location() {
		return resource_location;
	}
	/**
	 * @param resource_location the resource_location to set
	 */
	public void setResource_location(String resource_location) {
		this.resource_location = resource_location;
	}
	/**
	 * @return the resource_name
	 */
	public String getResource_name() {
		return resource_name;
	}
	/**
	 * @param resource_name the resource_name to set
	 */
	public void setResource_name(String resource_name) {
		this.resource_name = resource_name;
	}
	/**
	 * @return the contact_information
	 */
	public String getContact_information() {
		return contact_information;
	}
	/**
	 * @param contact_information the contact_information to set
	 */
	public void setContact_information(String contact_information) {
		this.contact_information = contact_information;
	}
	
}
