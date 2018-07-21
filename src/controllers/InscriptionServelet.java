package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.User;
import dao.UserDao;

/**
 * Servlet implementation class Inscription
 */
@WebServlet("/Inscription")
public class InscriptionServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InscriptionServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/Inscription.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String eamil1 = request.getParameter("email1");
		String p1 = request.getParameter("pass1");
		String p2 = request.getParameter("pass2");
		
		User user = new User();
		user.setEmail(eamil1);
		user.setMdp(p1);
		HttpSession session = request.getSession();
		session.setAttribute("useremail", user.getEmail());
		
		
		UserDao userdao = new UserDao(user.getEmail(), user.getMdp());
		//System.out.println(userdao.connection());
		System.out.println(userdao.addUser());
		
		
		if(p1.equals(p2)) {
			
			UserDao dao = new UserDao(user.getEmail(), user.getMdp());
			
			if(dao.addUser()) {
				
				//System.out.println(user.getEmail());
				this.getServletContext().getRequestDispatcher("/WEB-INF/InscriptionOk.jsp").forward(request, response);
			}else {
				this.getServletContext().getRequestDispatcher("/WEB-INF/Inscription.jsp").forward(request, response);
			}
		}
	}

}
