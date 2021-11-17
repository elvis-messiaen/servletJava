package exoServlet.pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import exoServlet.Articles;
import exoServlet.Roles;
import exoServlet.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class Session
 */
@WebServlet("/session")
public class Session extends HttpServlet {

    /**
     * Default constructor. 
     */
    public Session() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		
		Roles role = new Roles("user");
		Roles role1 = new Roles("admin");
		List<Articles> listBateau = new ArrayList();
		Articles bateau = new Articles("15erdt","bateau","fragatelle");
		Articles bateau1 = new Articles("25art","bateau1","plouf");
		Articles bateau2 = new Articles("08prt","bateau2","combattant");
		Articles bateau3 = new Articles("22ttt","bateau3","eliote");
		Articles bateau4 = new Articles("85brt","bateau4","pirate");
		Articles bateau5 = new Articles("99pop","bateau5","lapiserie");
	
		listBateau.add(bateau);
		listBateau.add(bateau1);
		listBateau.add(bateau2);
		listBateau.add(bateau3);
		listBateau.add(bateau4);
		listBateau.add(bateau5);
		
		User user = new User("fr12547","elvis","elvis@aol.fr",role,listBateau);
		//User admina = new User ("fr145a","louis","louis@aol.fr",role,listBateau);
		
		ServletOutputStream out = resp.getOutputStream();
		session.setAttribute("USER", user);
		
		String routes = null;
		String article = null;
		
		if (user.getRoles().getName().equals("admin")) {
			routes = "admin";
		}else if (user.getRoles().getName().equals("user")) {
			routes = "utilisateur";
			article = "article";
		}
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Page de connexion</h1>");
		out.println("<h3>Vous etes bien connecté sur le site</h3>");
		out.println("<a href="+ routes +" > page utilisateur </br> </a>");
		out.println("<a href="+ article +" > page articles </a>");
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
