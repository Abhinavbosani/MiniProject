package demoServletPrograms;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletCookie
 */
@WebServlet("/ServletCookie")
public class ServletCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie cookie=new Cookie("name2","Rahul");
		
		response.addCookie(cookie);
		PrintWriter out=response.getWriter();
		Cookie cookies[]=request.getCookies();
		for(Cookie c:cookies) {
			
			out.print("<html>"
					+ "<body>"
					+ "<table border=\"2\">"
					+ "<th>Cookie Name</th>"
					+ "<th>Cookie</th>"
					+ "<tr><td>"+c.getName()+"</td>"
					+ "<td>"+c.getValue()+"</td></tr></table></body></html>");
		}
		

	

}
}
