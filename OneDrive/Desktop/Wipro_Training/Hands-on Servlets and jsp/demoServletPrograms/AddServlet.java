package demoServletPrograms;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	public void service(HttpServletRequest rq,HttpServletResponse res) throws IOException{
		int n1=Integer.parseInt(rq.getParameter("num1"));
		int n2=Integer.parseInt(rq.getParameter("num2"));
		int sum=n1+n2;
		PrintWriter out=res.getWriter();
		out.println("Result is:"+sum);
		
		
	}

}
