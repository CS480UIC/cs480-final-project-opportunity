package tutoring_service.domain;

/**
 * Tutoring Service object
 * 
 * @author Jessica Borowy
 * 
 */
public class tutoring_service {
	/*
	 * Correspond to the tutoring_service table
	 */
	
	private Integer serviceId;
	private Integer userId; 
	private String address;
	private Integer total_tutors;
	private String operation_hours;
	private String service_name;
	private String contact_info;
	/**
	 * @return the serviceId
	 */
	public Integer getServiceId() {
		return serviceId;
	}
	/**
	 * @param serviceId the serviceId to set
	 */
	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}
	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the total_tutors
	 */
	public Integer getTotal_tutors() {
		return total_tutors;
	}
	/**
	 * @param total_tutors the total_tutors to set
	 */
	public void setTotal_tutors(Integer total_tutors) {
		this.total_tutors = total_tutors;
	}
	/**
	 * @return the operation_hours
	 */
	public String getOperation_hours() {
		return operation_hours;
	}
	/**
	 * @param operation_hours the operation_hours to set
	 */
	public void setOperation_hours(String operation_hours) {
		this.operation_hours = operation_hours;
	}
	/**
	 * @return the service_name
	 */
	public String getService_name() {
		return service_name;
	}
	/**
	 * @param service_name the service_name to set
	 */
	public void setService_name(String service_name) {
		this.service_name = service_name;
	}
	/**
	 * @return the contact_info
	 */
	public String getContact_info() {
		return contact_info;
	}
	/**
	 * @param contact_info the contact_info to set
	 */
	public void setContact_info(String contact_info) {
		this.contact_info = contact_info;
	}
	
}
