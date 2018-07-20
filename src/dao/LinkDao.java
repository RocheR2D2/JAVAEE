package dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import bean.Link;

public class LinkDao {

	String hostName = "localhost";
	String dbName="javaee";
	String userName = "root";
	String password = "";
	String url = "jdbc:mysql://" + hostName + ":3306/" + dbName;

	
	public LinkDao() {
		
	}
	
	public boolean addLink(Link link) {
			
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, userName, password);
			String sql = "INSERT INTO links (link, shortlink, linkvisite, mdp, duration, valide, date, userid) VALUES(?,?,?,?,?,?,?,?)";
			//System.out.println(sql);
			PreparedStatement state = con.prepareStatement(sql);
	
			state.setString(1, link.getLink());
			state.setString(2, link.getShortlink());
			state.setInt(3, link.getLinkvisite());
			state.setString(4,link.getMdp());
			state.setInt(5, link.getDuration());
			state.setBoolean(6, link.isValid());
			state.setString(7, link.getDate());
			state.setInt(8, link.getUserId());
			
			int i = state.executeUpdate();
			if(i > 0) {
				return true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	
		
	}
	
	
	public ArrayList<Link> listlinks(int userID){
		
		ArrayList<Link> liste = new ArrayList<Link>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, userName, password);
			PreparedStatement state = con.prepareStatement("select * from links where userid=?");
			state.setInt(1, userID);
			ResultSet rs = state.executeQuery();
			while(rs.next()) {
				
				int id = rs.getInt("id");
				
				Link link = new Link();
				link.setId( rs.getInt("id"));
				link.setLink(rs.getString("link"));
				link.setShortlink(rs.getString("shortlink"));
				link.setLinkvisite(rs.getInt("linkvisite"));
				link.setMdp(rs.getString("mdp"));
				link.setValid(rs.getBoolean("valide"));
				link.setDate(rs.getString("date"));
				link.setDuration(rs.getInt("duration"));
				link.setUserId(rs.getInt("userid"));
				
				
				liste.add(link);
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		return liste;
	}
	
	
}
