package academic_resource.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




//import java.util.ArrayList;
//import java.util.List;

import academic_resource.domain.Academic_resource;

/**
 * DDL functions performed in database
 */
public class Academic_resourceDao {
	
	/**
	 * user name to connect to the database 
	 */
	private String MySQL_user = "opportunity"; //TODO change user
	
	/**
	 * password of your username to connect to the database
	 */
	private String MySQL_password = "CS480@UIC"; //TODO change password

	public Academic_resource findByAcadAndUserID(Integer academicID, Integer userID) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Academic_resource ar = new Academic_resource();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bookstore", MySQL_user, MySQL_password);
		    String sql = "SELECT * FROM academic_resource where academic_id = ? and user_id = ?";
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,academicID);
		    preparestatement.setInt(2,userID);
		    ResultSet resultSet = preparestatement.executeQuery();

		    while(resultSet.next()){
		    	int academic_id = resultSet.getInt("academic_id");
		    	int user_id = resultSet.getInt("user_id");
		    	if(academic_id ==  academicID && user_id == userID){
		    		ar.setAcademic_id(academic_id);
		    		ar.setUser_id(user_id);
		    		ar.setTitle(resultSet.getString("title"));
		    		ar.setPayment_cost(resultSet.getDouble("payment_cost"));
		    		ar.setAcad_subject(resultSet.getString("acad_subject"));
		    		ar.setAcademic_description(resultSet.getString("acad_description"));
		    		ar.setAcda_location(resultSet.getString("acad_location"));
		    	}
		    }
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return ar;
	}	
	
	/**
	 * insert Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	
	public void add(Academic_resource form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bookstore", MySQL_user, MySQL_password);
			
			String sql = "insert into academic_resource values(academic_id,user_id,title,payment_cost,acad_subject,academic_description,acda_location) values(?,?,?,?,?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,form.getAcademic_id());
		    preparestatement.setInt(2,form.getUser_id());
		    preparestatement.setString(3,form.getTitle());
		    preparestatement.setDouble(4,form.getPayment_cost());
		    preparestatement.setString(5,form.getAcad_subject());
		    preparestatement.setString(6,form.getAcademic_description());
		    preparestatement.setString(7,form.getAcda_location());
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
	public void update(Academic_resource form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bookstore", MySQL_user, MySQL_password);

			String sql = "UPDATE academic_resource SET title = ?, payment_cost = ?, acad_subject = ?, academic_description = ?, acda_location = ? where academic_id = ? and user_id = ?;";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			preparestatement.setInt(1,form.getAcademic_id());
		    preparestatement.setInt(2,form.getUser_id());
		    preparestatement.setString(3,form.getTitle());
		    preparestatement.setDouble(4,form.getPayment_cost());
		    preparestatement.setString(5,form.getAcad_subject());
		    preparestatement.setString(6,form.getAcademic_description());
		    preparestatement.setString(7,form.getAcda_location());
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
	public void delete(String academicID, String userID) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bookstore", MySQL_user, MySQL_password);
			
			String sql = "delete from academic_resource where academic_id = ? and user_id = ?";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			preparestatement.setInt(1,Integer.parseInt(academicID));
		    preparestatement.setInt(2,Integer.parseInt(userID));
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
