
/*
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
import jakarta.servlet.annotation.WebFilter;


@WebFilter(filterName= "f1")
public class filter1 extends HttpServlet {

    public filter1() {
    }


	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		ServletOutputStream out = resp.getOutputStream();
		User user = (User)session.getAttribute("USER");
		
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
		out.println("<a href="+ routes +" > page utilisateur </br> </a>");
		out.println("<a href="+ article +" > page articles </a>");
		out.println("</body>");
		out.println("</html>");;
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

*/
