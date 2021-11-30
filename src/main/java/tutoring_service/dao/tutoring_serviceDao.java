package tutoring_service.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




//import java.util.ArrayList;
//import java.util.List;

import tutoring_service.domain.tutoring_service;

/**
 * DDL functions performed in database
 */
public class tutoring_serviceDao {
	
	/**
	 * user name to connect to the database 
	 */
	private String MySQL_user = "opportunity"; //TODO change user
	
	/**
	 * password of your username to connect to the database
	 */
	private String MySQL_password = "CS480@UIC"; //TODO change password

	public tutoring_service findByServiceAndUserId(int serviceId, int userId) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		tutoring_service ts = new tutoring_service();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/opportunity", MySQL_user, MySQL_password);
		    String sql = "select * from tutoring_service where service_id=? and user_id=?";
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,serviceId);
		    preparestatement.setInt(2,userId);
		    ResultSet resultSet = preparestatement.executeQuery();

		    while(resultSet.next()){
		    	int service_id = resultSet.getInt("service_id");
		    	int user_id = resultSet.getInt("user_id");
		    	if((service_id == serviceId) && (user_id == userId)){
		    		ts.setService_name(resultSet.getString("service_name"));
		    		ts.setServiceId(service_id);
		    		ts.setUserId(user_id);
		    		ts.setAddress(resultSet.getString("address"));
		    		ts.setOperation_hours(resultSet.getString("operation_hours"));
		    		ts.setContact_info(resultSet.getString("contact_info"));
		    		ts.setTotal_tutors(resultSet.getInt("total_tutors"));
		    	}
		    }
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return ts;
	}	
	
	/**
	 * insert tutoring_service
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	
	public void add(tutoring_service form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/opportunity", MySQL_user, MySQL_password);
			
			String sql = "insert into tutoring_service (service_id, user_id, service_name, address, total_tutors, operation_hours, contact_info) values(?,?,?,?,?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,form.getServiceId());
		    preparestatement.setInt(2,form.getUserId());
		    preparestatement.setString(3,form.getService_name());
		    preparestatement.setString(4,form.getAddress());
		    preparestatement.setInt(5,form.getTotal_tutors());
		    preparestatement.setString(6,form.getOperation_hours());
		    preparestatement.setString(7,form.getContact_info());
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
	public void update(tutoring_service form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/opportunity", MySQL_user, MySQL_password);
			
			String sql = "UPDATE tutoring_service SET service_name = ?, address = ?, total_tutors = ?, operation_hours = ?, contact_info = ? where service_id = ? and user_id = ?;";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,form.getService_name());
		    preparestatement.setString(2,form.getAddress());
		    preparestatement.setInt(3,form.getTotal_tutors());
		    preparestatement.setString(4,form.getOperation_hours());
		    preparestatement.setString(5,form.getContact_info());
		    preparestatement.setInt(6,form.getServiceId());
			preparestatement.setInt(7,form.getUserId());
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
	public void delete(String serviceId, String userId) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/opportunity", MySQL_user, MySQL_password);
			
			String sql = "delete from tutoring_service where service_id = ? and user_id = ?";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,Integer.parseInt(serviceId));
		    preparestatement.setInt(2,Integer.parseInt(userId));
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
