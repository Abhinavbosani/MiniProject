package demoServletPrograms;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletAdd
 */
@WebServlet("/add")
public class ServletAdd extends HttpServlet {
	public void doGet(HttpServletRequest rq,HttpServletResponse res) throws IOException, ServletException{
		int n1=Integer.parseInt(rq.getParameter("num1"));
		int n2=Integer.parseInt(rq.getParameter("num2"));
		int sum=n1+n2;
//		rq.setAttribute("sum",sum);
		res.sendRedirect("SquareServlet?sum="+sum);
		
		
//		RequestDispatcher dispatcher=rq.getRequestDispatcher("SquareServlet");
//		dispatcher.forward(rq, res);
//		
		
	}
	
	
}	
	


