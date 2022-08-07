package Com.to.Servlet;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Com.to.dao.Logindao;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginpage")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
public LoginServlet()
{
	super();
}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		try {
		
		String username = request.getParameter("username");   
	    String password = request.getParameter("password");
	    if (Logindao.validate(username,password)) {
	    	HttpSession session=request.getSession();
	        session.setAttribute("userid", username);
	        RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
	        rd.forward(request, response);
	       
	    } else {
	    	request.setAttribute("message", "Invalid Username & Password");}
	    	RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
	        rd.forward(request, response);
		} catch (Exception ex) {
			ex.printStackTrace();
	    }
	    out.close();
	    } 
	
	}


