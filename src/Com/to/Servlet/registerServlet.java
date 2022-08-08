package Com.to.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Com.to.dao.registerDao;
import Com.to.data.User;

/**
 * Servlet implementation class registerServlet
 */
@WebServlet("/register")
public class registerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		try {
		 String first_name = request.getParameter("first_name");
		 String last_name = request.getParameter("last_name");
         String email = request.getParameter("email");
         String username = request.getParameter("username");   
 	    String password = request.getParameter("password");
         if(first_name.isEmpty()|| last_name.isEmpty()|| email.isEmpty()||username.isEmpty()|| password.isEmpty())
        
        	 {
        	 RequestDispatcher req=request.getRequestDispatcher("register.jsp");
        	 request.setAttribute("Message", "Please enter complete details");
        	 req.forward(request, response);
        	 }
         else{
         User user = new User();
         user.setFirst_name(first_name);
         user.setLast_name(last_name);
         user.setUsername(username);
         user.setEmail(email);
         user.setPassword(password);
                     
         registerDao rDao = new registerDao();
         
         String userRegistered = null;
		 try {
			userRegistered = rDao.registerUser(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  if(userRegistered.equals("SUCCESS"))   
         {
        	 RequestDispatcher rd=request.getRequestDispatcher("Success.jsp");
 	        rd.forward(request, response);
 	     
            
         }
         else   
         {
            request.setAttribute("Message", userRegistered);
            RequestDispatcher rd=request.getRequestDispatcher("register.jsp");
            rd.forward(request, response);
           
         }
     } }catch (Exception ex) {
			ex.printStackTrace();
	    }
      out.close();
	}}


