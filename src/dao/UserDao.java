package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.User;

public class UserDao {
	

	String hostName = "localhost";
	String dbName="javaee";
	String userName = "root";
	String password = "";
	String url = "jdbc:mysql://" + hostName + ":3306/" + dbName;
	
	private String email;
	private String mdp;
	
	
	public UserDao(String email, String mdp) {
		this.email = email;
		this.mdp = mdp;
	}
	
	public boolean connection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, userName, password);
			PreparedStatement state = con.prepareStatement("select * from users where email=? and mdp=?");
			state.setString(1, email);
			state.setString(2, mdp);
			ResultSet rs = state.executeQuery();
			if(rs.next()) {
				return true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean addUser() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, userName, password);
			String sql = "INSERT INTO users (email, mdp) VALUES(?,?)";
			//System.out.println(sql);
			PreparedStatement state = con.prepareStatement(sql);
			state.setString(1, email);
			state.setString(2, mdp);
			int i = state.executeUpdate();
			if(i > 0) {
				return true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
