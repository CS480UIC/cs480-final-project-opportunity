package academic_resource.domain;

/**
 * User object
 * 
 * @author Christina Wen
 * 
 */
public class Academic_resource {
	/*
	 * Correspond to the user table
	 */
	
	private Integer academic_id;
	private Integer user_id;
	private String title;
	private double payment_cost;
	private String acad_subject;
	private String academic_description;
	private String acda_location;
	
	
	/**
	 * @return the academic_id
	 */
	public Integer getAcademic_id() {
		return academic_id;
	}
	/**
	 * @param academic_id the academic_id to set
	 */
	public void setAcademic_id(Integer academic_id) {
		this.academic_id = academic_id;
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
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the payment_cost
	 */
	public double getPayment_cost() {
		return payment_cost;
	}
	/**
	 * @param payment_cost the payment_cost to set
	 */
	public void setPayment_cost(double payment_cost) {
		this.payment_cost = payment_cost;
	}
	/**
	 * @return the acad_subject
	 */
	public String getAcad_subject() {
		return acad_subject;
	}
	/**
	 * @param acad_subject the acad_subject to set
	 */
	public void setAcad_subject(String acad_subject) {
		this.acad_subject = acad_subject;
	}
	/**
	 * @return the academic_description
	 */
	public String getAcademic_description() {
		return academic_description;
	}
	/**
	 * @param academic_description the academic_description to set
	 */
	public void setAcademic_description(String academic_description) {
		this.academic_description = academic_description;
	}
	/**
	 * @return the acda_location
	 */
	public String getAcda_location() {
		return acda_location;
	}
	/**
	 * @param acda_location the acda_location to set
	 */
	public void setAcda_location(String acda_location) {
		this.acda_location = acda_location;
	}
	
	
	
}
