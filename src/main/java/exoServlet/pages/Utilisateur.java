package exoServlet.pages;

import java.io.IOException;

import exoServlet.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet( urlPatterns = {"/utilisateur"})
public class Utilisateur extends HttpServlet {


    /**
     * Default constructor. 
     */
    public Utilisateur() {
    
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		User user = (User)session.getAttribute("USER");
		
		if(user == null ) {
			resp.sendRedirect(
					this.getServletContext().getContextPath()
					+ "/session");
		}
		ServletOutputStream out = resp.getOutputStream();
		session.setAttribute("USER", user);
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>page Utilisateur<h1>");
		out.println("<p>UID :" +user.getUID() + "</p>");
		out.println("<p>username :" +user.getUsername() + "</p>");
		out.println("<p>email :" +user.getEmail() + "</p>");
		out.println("<p>Roles :" +user.getRoles() + "</p>");
		out.println("<p>Nombres articles :" +user.getArticles().size() + "</p>");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
