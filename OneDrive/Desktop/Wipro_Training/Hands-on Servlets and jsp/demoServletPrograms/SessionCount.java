package demoServletPrograms;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SessionCount")
public class SessionCount extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		PrintWriter out=response.getWriter();
		int vCount=0;
		if(session.isNew()) {
			
			out.println("Number of Visits="+0);
		}
		else {
			
			vCount=(int) session.getAttribute("visitCount");
			vCount++;
			out.println("Number of Visits="+vCount);
		}
		session.setAttribute("visitCount",vCount);
	}

	
}
