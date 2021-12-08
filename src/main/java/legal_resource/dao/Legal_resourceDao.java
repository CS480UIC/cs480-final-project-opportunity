package legal_resource.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import legal_resource.domain.LegalResourceUser;
import legal_resource.domain.Legal_resource;

//import java.util.ArrayList;
//import java.util.List;


/**
 * DDL functions performed in database
 */
public class Legal_resourceDao {
	
	/**
	 * user name to connect to the database 
	 */
	private String MySQL_user = "opportunity"; //TODO change user
	
	/**
	 * password of your username to connect to the database
	 */
	private String MySQL_password = "CS480@UIC"; //TODO change password

	public Legal_resource findByLegalIDAndUserID(Integer legalID, Integer userID) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Legal_resource lr = new Legal_resource();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/opportunity", MySQL_user, MySQL_password);
		    String sql = "SELECT * FROM legal_resource where legal_id = ? and user_id = ?";
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,legalID);
		    preparestatement.setInt(2,userID);
		    ResultSet resultSet = preparestatement.executeQuery();

		    while(resultSet.next()){
		    	int legal_id = resultSet.getInt("legal_id");
		    	int user_id = resultSet.getInt("user_id");
		    	if(legal_id == legalID && user_id == userID){
		    		lr.setLegal_id(legal_id);
		    		lr.setUser_id(user_id);
		    		lr.setCost(resultSet.getDouble("cost"));
		    		lr.setLegal_description(resultSet.getString("legal_description"));
		    		lr.setResource_location(resultSet.getString("resource_location"));
		    		lr.setResource_name(resultSet.getString("resource_name"));
		    		lr.setContact_information(resultSet.getString("contact_information"));	
		    	}
		    }
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return lr;
	}	
	
	/**
	 * insert Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	
	public void add(Legal_resource form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/opportunity", MySQL_user, MySQL_password);
			
			String sql = "insert into legal_resource (legal_id, user_id, cost, legal_description, resource_location, resource_name, contact_information) values(?,?,?,?,?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,form.getLegal_id());
		    preparestatement.setInt(2,form.getUser_id());
		    preparestatement.setDouble(3,form.getCost());
		    preparestatement.setString(4,form.getLegal_description());
		    preparestatement.setString(5,form.getResource_location());
		    preparestatement.setString(6,form.getResource_name());
		    preparestatement.setString(7,form.getContact_information());
		    
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
	public void update(Legal_resource form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/opportunity", MySQL_user, MySQL_password);
			
			String sql = "UPDATE legal_resource SET cost = ?, legal_description = ?, resource_location = ?, resource_name = ?, contact_information = ? where legal_id = ? and user_id = ?";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setDouble(1,form.getCost());
		    preparestatement.setString(2,form.getLegal_description());
		    preparestatement.setString(3,form.getResource_location());
		    preparestatement.setString(4,form.getResource_name());
		    preparestatement.setString(5,form.getContact_information());
		    preparestatement.setInt(6,form.getLegal_id());
		    preparestatement.setInt(7,form.getUser_id());
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
	public void delete(String legalID, String userID) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/opportunity", MySQL_user, MySQL_password);
			
			String sql = "delete from legal_resource where legal_id = ? and user_id = ?";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			preparestatement.setInt(1,Integer.parseInt(legalID));
		    preparestatement.setInt(2,Integer.parseInt(userID));
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public List<Object> findAllUserLR() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		List<Object> list = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/opportunity", MySQL_user, MySQL_password);
			String sql = "SELECT username, cost, legal_description FROM user AS U INNER JOIN legal_resource AS LR\n"
					+ "	ON U.user_id = LR.user_id";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			ResultSet resultSet = preparestatement.executeQuery();			
			while(resultSet.next()){
				LegalResourceUser lrU = new LegalResourceUser();
				lrU.setUsername(resultSet.getString("username"));
				lrU.setCost(resultSet.getDouble("cost"));
				lrU.setLegal_description(resultSet.getString("legal_description"));
				System.out.println(resultSet.getString("username"));
				System.out.println(resultSet.getDouble("cost"));

	    		list.add(lrU);
			 }
			connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
		
	}
}
