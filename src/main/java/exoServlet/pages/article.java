package exoServlet.pages;

import java.io.IOException;
import java.util.Iterator;
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
 * Servlet implementation class article
 */
@WebServlet("/article")
public class article extends HttpServlet {


    public article() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		User user = (User)session.getAttribute("USER");
		List<Articles> article = (List<Articles>) session.getAttribute("ART");
		//Articles article = (Articles)session.getAttribute("ART");
		//String article2 = req.getParameter("titre");
		
		//String arti =  req.getParameter("titre");
		if(article == null) {
			resp.sendRedirect(
					this.getServletContext().getContextPath()
					+ "/session");
		}
		ServletOutputStream out = resp.getOutputStream();
		session.setAttribute("ART", article);
		
		for (int i = 0; i < article.size(); i++) {
			  String value = article.get(i).getTitre().toString();
		}
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>page articles<h1>");
		out.println("<p>Nombres articles :" + article + "</p>");
		// out.println("<p>titre </p>" + arti);
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
