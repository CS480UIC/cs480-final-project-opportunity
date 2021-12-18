package init.domain;

/**
 * User object
 * @author Aayush Makharia
 */
public class Init {
	/*
	 * Correspond to the user table
	 */
	
	private int userId;
	private String username;
	private String password; 
	private String dateTime;
	

	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setUserId(int id) {
		this.userId = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	
	public String getDateTime() {
		return dateTime;
	}

	
	@Override
	public String toString() {
		return "User [ user ID=" + userId + "username=" + username + ", password="
				+ password + ", DateTime=" + dateTime +"]";
	}
}
