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
 * Servlet implementation class Connexion
 */
@WebServlet("/Connexion")
public class ConnexionServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConnexionServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/Connexion.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String eamil0 = request.getParameter("email0");
		String p0 = request.getParameter("pass0");

		
		User user = new User();
		user.setEmail(eamil0);
		user.setMdp(p0);
		
		UserDao userdao = new UserDao(user.getEmail(), user.getMdp());
		
		if(userdao.connection()) {
			HttpSession session = request.getSession();
			session.setAttribute("useremail", user.getEmail());
			this.getServletContext().getRequestDispatcher("/WEB-INF/ConnexionOk.jsp").forward(request, response);
		}else {
			response.sendRedirect("homeServelet");
		}
	}

}
