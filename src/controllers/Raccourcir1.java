package controllers;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Link;
import bean.User;
import dao.LinkDao;
import dao.UserDao;
import function.Racourcir;

/**
 * Servlet implementation class Raccourcir1
 */
@WebServlet("/Raccourcir1")
public class Raccourcir1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Raccourcir1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String url = request.getParameter("fullurl");
		
		
		Racourcir r = new Racourcir();
		
		
		
		request.setAttribute("shorturl", r.shortUrl(url));

		this.getServletContext().getRequestDispatcher("/WEB-INF/SimpleShort.jsp").forward(request, response);
			
		
		/*
		HttpSession session = request.getSession();
		String email = (String) session.getAttribute("useremail");
		User user = new User();
		user.setEmail(email);
		UserDao dao = new UserDao();
		*/
		
		/*
		Link link = new Link();
		LinkDao dao = new LinkDao();
		link.setLink(url);
		link.setDuration(0);
		Date date = new Date();
		link.setDate(date.toString());
		link.setShortlink(r.shortUrl(url));
		link.setLinkvisite(0);
		link.setMdp("");
		link.setValid(true);
		link.setUserId(0);
		
		if(dao.addLink(link)) {
			
		}
		*/
	}

}
