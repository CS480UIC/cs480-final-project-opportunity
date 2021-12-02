package job_opportunity.domain;

/**
 * User object
 * 
 * @author Rohith Rajan
 * 
 */
public class JobOpportunity {
	/*
	 * Correspond to the user table
	 */
	
	private int jobID;
	private int userID;
	private int companyID;
	private float salary;
	
	private String jobDescription;
	private String applicationInfo; 
	private String benefitDescription;
	
	
	private String positionTitle;
	/**
	 * @return the jobID
	 */
	public int getJobID() {
		return jobID;
	}
	/**
	 * @param jobID the jobID to set
	 */
	public void setJobID(int jobID) {
		this.jobID = jobID;
	}
	/**
	 * @return the userID
	 */
	public int getUserID() {
		return userID;
	}
	/**
	 * @param userID the userID to set
	 */
	public void setUserID(int userID) {
		this.userID = userID;
	}
	/**
	 * @return the companyID
	 */
	public int getCompanyID() {
		return companyID;
	}
	/**
	 * @param companyID the companyID to set
	 */
	public void setCompanyID(int companyID) {
		this.companyID = companyID;
	}
	/**
	 * @return the salary
	 */
	public float getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(float salary) {
		this.salary = salary;
	}
	/**
	 * @return the positionTitle
	 */
	public String getPositionTitle() {
		return positionTitle;
	}
	/**
	 * @param positionTitle the positionTitle to set
	 */
	public void setPositionTitle(String positionTitle) {
		this.positionTitle = positionTitle;
	}
	/**
	 * @return the jobDescription
	 */
	public String getJobDescription() {
		return jobDescription;
	}
	/**
	 * @param jobDescription the jobDescription to set
	 */
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
	/**
	 * @return the applicationInfo
	 */
	public String getApplicationInfo() {
		return applicationInfo;
	}
	/**
	 * @param applicationInfo the applicationInfo to set
	 */
	public void setApplicationInfo(String applicationInfo) {
		this.applicationInfo = applicationInfo;
	}
	/**
	 * @return the benefitDescription
	 */
	public String getBenefitDescription() {
		return benefitDescription;
	}
	/**
	 * @param benefitDescription the benefitDescription to set
	 */
	public void setBenefitDescription(String benefitDescription) {
		this.benefitDescription = benefitDescription;
	}
	
	
	
	
	
}
