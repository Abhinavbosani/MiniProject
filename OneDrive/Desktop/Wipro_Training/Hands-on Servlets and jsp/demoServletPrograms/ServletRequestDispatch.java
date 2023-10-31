package demoServletPrograms;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletRequestDispatch
 */
@WebServlet("/ServletRequestDispatch")
public class ServletRequestDispatch extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int n1=Integer.parseInt(request.getParameter("num1"));
		int n2=Integer.parseInt(request.getParameter("num2"));
		int sum=n1+n2;
		request.setAttribute("sum", sum);
		
		
		RequestDispatcher rd=request.getRequestDispatcher("ServletSq2");
		rd.forward(request, response);
	}

	

}
