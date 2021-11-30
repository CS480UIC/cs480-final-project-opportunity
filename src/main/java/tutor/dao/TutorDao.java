package tutor.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




//import java.util.ArrayList;
//import java.util.List;

import tutor.domain.Tutor;

/**
 * DDL functions performed in database
 */
public class TutorDao {
	
	/**
	 * user name to connect to the database 
	 */
	private String MySQL_user = "opportunity"; //TODO change user
	
	/**
	 * password of your username to connect to the database
	 */
	private String MySQL_password = "CS480@UIC"; //TODO change password

	public Tutor findByID(int id) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Tutor tutor = new Tutor();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/opportunity", MySQL_user, MySQL_password);
		    String sql = "select * from tutor where tutor_id=?";
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,id);
		    ResultSet resultSet = preparestatement.executeQuery();

		    while(resultSet.next()){
		    	int tutor_id = resultSet.getInt("tutor_id");
		    	if(tutor_id == id){
		    		tutor.setTutor_id(tutor_id);
		    		tutor.setFull_name(resultSet.getString("fullname"));
		    		tutor.setGrade_level(resultSet.getInt("grade_level"));
		    		tutor.setSubject(resultSet.getString("subject"));
		    		tutor.setFee(resultSet.getDouble("fee"));
		    		tutor.setService_id(resultSet.getInt("service_id"));
		    		tutor.setPhone_number(resultSet.getString("phone_number"));
		    		tutor.setTutor_hours(resultSet.getString("tutor_hours"));
		    	}
		    }
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return tutor;
	}	
	
	/**
	 * insert Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	
	public void add(Tutor form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/opportunity", MySQL_user, MySQL_password);
			
			String sql = "insert into tutor values(?,?,?,?,?,?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,form.getTutor_id());
		    preparestatement.setString(2,form.getFull_name());
		    preparestatement.setInt(3,form.getGrade_level());
		    preparestatement.setString(4,form.getSubject());
		    preparestatement.setDouble(5,form.getFee());
		    preparestatement.setInt(6,form.getService_id());
		    preparestatement.setString(7,form.getPhone_number());
		    preparestatement.setString(8,form.getTutor_hours());
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
	public void update(Tutor form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/opportunity", MySQL_user, MySQL_password);
			
			String sql = "UPDATE tutor SET fullname = ?, grade_level = ?, subject = ?, fee = ?, service_id = ?, phone_number = ?, tutor_hours = ? where tutor_id = ?;";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,form.getFull_name());
		    preparestatement.setInt(2,form.getGrade_level());
		    preparestatement.setString(3,form.getSubject());
		    preparestatement.setDouble(4,form.getFee());
		    preparestatement.setInt(5,form.getService_id());
		    preparestatement.setString(6,form.getPhone_number());
		    preparestatement.setString(7,form.getTutor_hours());
		    preparestatement.setInt(8,form.getTutor_id());
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
	public void delete(int id) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/opportunity", MySQL_user, MySQL_password);
			
			String sql = "delete from tutor where tutor_id = ?";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,id);
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
