package demoServletPrograms;


import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/welcome")
public class DisplayServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>First Servlet Program!</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1> "+"Welcome To First Servlet Program !!!"+"</h1>");
		out.println("</body>");
		out.println("</html>");
		}
	}