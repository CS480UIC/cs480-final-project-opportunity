package legal_resource.domain;

/**
 * User object
 * 
 * @author Aayush Makharia
 * 
 */
public class Legal_resource {
	/*
	 * Correspond to the user table
	 */
	
	private String username;
	private String password; 
	private String email;
	
	
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [ username=" + username + ", password="
				+ password + ", email=" + email +"]";
	}
}
