package legal_resource.domain;

public class LegalResourceUser {
	private String username;
	private double cost;
	private String legal_description;
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
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

}
