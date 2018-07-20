package bean;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {
private static final long serialVersionUID = 6297385302078200511L;
	
	private String mdp;
	private String email;
	private int id;
	
	
	public User() {
		
	}
	
	public User(String email) {
		this.email = email;
	}
	
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
}
