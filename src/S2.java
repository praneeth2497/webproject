

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class S2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	HttpSession session=request.getSession();
		 String firstname=(String)session.getAttribute("fn");
	        String lastname=(String)session.getAttribute("ln");
		String username=request.getParameter("nm");
	String password=request.getParameter("ps");
	PrintWriter pw=response.getWriter();
	pw.print("Registration success"+""+username+""+password+""+firstname+""+lastname);
	}

}
