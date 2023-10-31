package demoServletPrograms;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SquareServlet
 */
@WebServlet("/SquareServlet")
public class SquareServlet extends HttpServlet {
	public void doGet(HttpServletRequest rq,HttpServletResponse res) throws IOException{
		
		int sq=Integer.parseInt(rq.getParameter("sum"));
		sq=sq*sq;
		
		PrintWriter out=res.getWriter();
		out.println("Result is:"+sq);
		
		
	}
	

}
