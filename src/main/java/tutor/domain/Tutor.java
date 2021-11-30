package tutor.domain;

/**
 * User object
 * 
 * @author Aayush Makharia
 * 
 */
public class Tutor {
	/*
	 * Correspond to the user table
	 */
	
	private int tutor_id;
	private String full_name; 
	private int grade_level;
	private String subject;
	private double fee;
	private int service_id;
	private String phone_number;
	private String tutor_hours;
	/**
	 * @return the tutor_id
	 */
	public int getTutor_id() {
		return tutor_id;
	}
	/**
	 * @param tutor_id the tutor_id to set
	 */
	public void setTutor_id(int tutor_id) {
		this.tutor_id = tutor_id;
	}
	/**
	 * @return the full_name
	 */
	public String getFull_name() {
		return full_name;
	}
	/**
	 * @param full_name the full_name to set
	 */
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	/**
	 * @return the grade_level
	 */
	public int getGrade_level() {
		return grade_level;
	}
	/**
	 * @param grade_level the grade_level to set
	 */
	public void setGrade_level(int grade_level) {
		this.grade_level = grade_level;
	}
	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}
	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}
	/**
	 * @return the fee
	 */
	public double getFee() {
		return fee;
	}
	/**
	 * @param fee the fee to set
	 */
	public void setFee(double fee) {
		this.fee = fee;
	}
	/**
	 * @return the service_id
	 */
	public int getService_id() {
		return service_id;
	}
	/**
	 * @param service_id the service_id to set
	 */
	public void setService_id(int service_id) {
		this.service_id = service_id;
	}
	/**
	 * @return the phone_number
	 */
	public String getPhone_number() {
		return phone_number;
	}
	/**
	 * @param phone_number the phone_number to set
	 */
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	/**
	 * @return the tutor_hours
	 */
	public String getTutor_hours() {
		return tutor_hours;
	}
	/**
	 * @param tutor_hours the tutor_hours to set
	 */
	public void setTutor_hours(String tutor_hours) {
		this.tutor_hours = tutor_hours;
	}
	
	
	
}
