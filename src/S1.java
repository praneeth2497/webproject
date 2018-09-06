

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class S1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String firstname=request.getParameter("n");
	String lastname=request.getParameter("t");
    HttpSession  session=request.getSession();
    session.setAttribute("fn",firstname);
    session.setAttribute("ln",lastname);


	PrintWriter pw=response.getWriter();
	pw.print("<html> <body> <form action='s2'> UserName<input type='text' name='nm'> password<input type='text' name='ps'> <input type='submit' value='Register'> </form> </body> </html>");
	
	
	}

}
