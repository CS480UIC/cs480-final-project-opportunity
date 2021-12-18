package health_resources.domain;

/**
 * User object
 * 
 * @author  Bhavana Radharapu
 * 
 */
public class Health_Resources {
	
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
	 * @return the health_id
	 */
	public Integer getHealth_id() {
		return health_id;
	}
	/**
	 * @param health_id the health_id to set
	 */
	public void setHealth_id(Integer health_id) {
		this.health_id = health_id;
	}
	/**
	 * @return the contact
	 */
	public String getContact() {
		return contact;
	}
	/**
	 * @param contact the contact to set
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}
	/**
	 * @return the health_type
	 */
	public String getHealth_type() {
		return health_type;
	}
	/**
	 * @param health_type the health_type to set
	 */
	public void setHealth_type(String health_type) {
		this.health_type = health_type;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @return the service_description
	 */
	public String getService_description() {
		return service_description;
	}
	/**
	 * @param service_description the service_description to set
	 */
	public void setService_description(String service_description) {
		this.service_description = service_description;
	}
	/**
	 * @return the payment
	 */
	public String getPayment() {
		return payment;
	}
	/**
	 * @param payment the payment to set
	 */
	public void setPayment(String payment) {
		this.payment = payment;
	}
	private Integer user_id;
	private Integer health_id;
	private String contact;
	private String health_type;
	private String location;
	private String service_description;
	private String payment;
}
