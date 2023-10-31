package demoServletPrograms;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletSq
 */
@WebServlet("/ServletSq")
public class ServletSq extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int sq=Integer.parseInt(request.getParameter("sum"));
		sq=sq*sq;
		PrintWriter out=response.getWriter();
		out.println("Result is: "+sq);
	}

	
}
