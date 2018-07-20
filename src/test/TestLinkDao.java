package test;

import java.util.ArrayList;
import java.util.Date;

import bean.Link;
import dao.LinkDao;
import dao.UserDao;

public class TestLinkDao {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Link link = new Link();
		
		link.setLink("");
		link.setShortlink("");
		link.setLinkvisite(0);
		link.setMdp("");
		link.setValid(true);
		Date date = new Date();
		link.setDate(date.toString());
		link.setDuration(5);
		link.setUserId(1);
		*/
		LinkDao dao = new LinkDao();
		//System.out.println(dao.addLink(link));
		
		ArrayList<Link> links = dao.listlinks(1);
		
		for(int i = 0; i < links.size(); i++) {   
		    System.out.print(links.get(i).getDate());
		}  
		
		
	}
}
