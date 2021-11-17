package exoServlet.pages;

import java.io.IOException;
import java.util.List;

import exoServlet.Articles;
import exoServlet.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class detail
 */
@WebServlet("/detail")
public class detail extends HttpServlet {
    /**
     * Default constructor. 
     */
    public detail() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		User user = (User)session.getAttribute("USER");
		List<Articles> article = (List<Articles>) session.getAttribute("ART");
		
		
		ServletOutputStream out = resp.getOutputStream();
		session.setAttribute("ART", article);
		
		String titre = null;
		String contenu = null;
		
		
		for (int i = 0; i < user.getArticles().size(); i++) {
			titre = user.getArticles().get(i).getTitre().toString();
			contenu = user.getArticles().get(i).getContenu().toString();
			
		
		
		
		out.println("<html>");
		out.println("<body>");
		out.println("<p> titre article :" + titre + "</p>");
		out.println("<p> contenu articles :" + contenu + "</p>");
		out.println("<a href= '/detail'>detail</a>");
		out.println("</body>");
		out.println("</html>");
	}
}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
