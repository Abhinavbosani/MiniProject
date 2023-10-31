package demoServletPrograms;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletSession
 */
@WebServlet("/ServletSession")
public class ServletSession extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		String uName=request.getParameter("username");
		PrintWriter pWriter=response.getWriter();
		session.setAttribute("user", uName);
		
		
		
		if(!(session.getAttribute("user")==null)) {
			pWriter.println("Welcome back");
		}
		else {
			pWriter.println("Welcome "+uName+"");
		}
		
		
		
	}

	
}
