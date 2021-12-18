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
	private String acad_location;
	
	
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
	 * @return the acad_location
	 */
	public String getAcad_location() {
		return acad_location;
	}
	/**
	 * @param acad_location the acad_location to set
	 */
	public void setAcad_location(String acad_location) {
		this.acad_location = acad_location;
	}
	
	
	
}