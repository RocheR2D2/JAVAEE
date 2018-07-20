package bean;

import java.util.ArrayList;


public class Link {
	
	private int id;
	private String link;
	private String shortlink;
	private int linkvisite;	
	private String mdp;
	private int duration;
	private int userId;
	private boolean valid;
	private String date;
	
	public Link() {
		
	}

	public Link(int id, String link, String shortlink, int linkvisite, String mdp, int duration, int userId,
			boolean valid, String date) {
		super();
		this.id = id;
		this.link = link;
		this.shortlink = shortlink;
		this.linkvisite = linkvisite;
		this.mdp = mdp;
		this.duration = duration;
		this.userId = userId;
		this.valid = valid;
		this.date = date;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getShortlink() {
		return shortlink;
	}

	public void setShortlink(String shortlink) {
		this.shortlink = shortlink;
	}

	public int getLinkvisite() {
		return linkvisite;
	}

	public void setLinkvisite(int linkvisite) {
		this.linkvisite = linkvisite;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
	
}
