package job_opportunity.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//import java.util.ArrayList;
//import java.util.List;

import job_opportunity.domain.JobOpportunity;
import user.domain.User;

/**
 * DDL functions performed in database
 */
public class JobOpportunityDao {
	
	/**
	 * user name to connect to the database 
	 */
	private String MySQL_user = "opportunity"; //TODO change user
	
	/**
	 * password of your username to connect to the database
	 */
	private String MySQL_password = "CS480@UIC"; //TODO change password

	public JobOpportunity findByJobAndUserID(Integer job_id, Integer user_id) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		JobOpportunity job = new JobOpportunity();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/opportunity", MySQL_user, MySQL_password);
		    String sql = "select * from job_opportunity where job_id = ? and user_id = ?";
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,job_id);
		    preparestatement.setInt(2,user_id);
		    ResultSet resultSet = preparestatement.executeQuery();

		    while(resultSet.next()){
		    	Integer jobID = Integer.parseInt(resultSet.getString("job_id"));
		    	Integer userID = Integer.parseInt(resultSet.getString("user_id"));
		    	
		    	if( (user_id == userID) && (jobID == job_id)){
		    		job.setJobID(jobID);
		    		job.setUserID(userID);
		    		job.setApplicationInfo(resultSet.getString("application_info"));
		    		job.setBenefitDescription(resultSet.getString("benefit_description"));
		    		job.setJobDescription(resultSet.getString("job_description"));
		    		job.setCompanyID(Integer.parseInt(resultSet.getString("company_id")));
		    		job.setSalary(Float.parseFloat(resultSet.getString("salary")));
		    		job.setPositionTitle(resultSet.getString("position_title"));
		    		
		    	}
		    }
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return job;
	}	
	
	/**
	 * insert Job
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	
	public void add(JobOpportunity form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/opportunity", MySQL_user, MySQL_password);
			
			String sql = "insert into job_opportunity values(?,?,?,?,?,?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,form.getJobID());
		    preparestatement.setInt(2,form.getUserID());
		    preparestatement.setString(3,form.getJobDescription());
		    
		    preparestatement.setString(4,form.getApplicationInfo());
		    preparestatement.setString(5,form.getBenefitDescription());
		    preparestatement.setInt(6,form.getCompanyID());
		    
		    preparestatement.setFloat(7,form.getSalary());
		    preparestatement.setString(8,form.getPositionTitle());
		    
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	/**
	 * @param form
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public void update(JobOpportunity form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/opportunity", MySQL_user, MySQL_password);
			
			String sql = "UPDATE job_opportunity SET company_id = ?, position_title = ?, salary = ?, job_description = ?, benefit_description = ?, application_info = ? where job_id = ? and user_id = ?;";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		   
			preparestatement.setInt(1, form.getCompanyID());
			preparestatement.setString(2, form.getPositionTitle());
			preparestatement.setFloat(3, form.getSalary());
			preparestatement.setString(4, form.getJobDescription());
			preparestatement.setString(5, form.getBenefitDescription());
			preparestatement.setString(6, form.getApplicationInfo());
			preparestatement.setInt(7, form.getJobID());
			preparestatement.setInt(8, form.getUserID());
			
			
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	/**
	 * @param username
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public void delete(Integer job_id, Integer user_id) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/opportunity", MySQL_user, MySQL_password);
			
			String sql = "delete from job_opportunity where job_id = ? and user_id = ?";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,job_id);
		    preparestatement.setInt(2,user_id);
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}

	
	public List<Object> findJobs() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		List<Object> list = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/opportunity", MySQL_user, MySQL_password);
			String sql = "select * from jobs";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			ResultSet resultSet = preparestatement.executeQuery();			
			while(resultSet.next()){
				JobOpportunity job = new JobOpportunity();
				job.setPositionTitle(resultSet.getString("position_title"));
				job.setJobDescription(resultSet.getString("job_description"));
	    		job.setSalary(Float.parseFloat(resultSet.getString("salary")));

	    		list.add(job);
			 }
			connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
		
	}
}
