package tutor.domain;

/**
 * User object
 * 
 * @author Jessica Borowy
 * 
 */
public class TotalTutor {
	/*
	 * Correspond to the user table
	 */
	
	private String subject;
	private int totalTutors;
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
	 * @return the totalTutors
	 */
	public int getTotalTutors() {
		return totalTutors;
	}
	/**
	 * @param totalTutors the totalTutors to set
	 */
	public void setTotalTutors(int totalTutors) {
		this.totalTutors = totalTutors;
	}
	
	
	
	
}
