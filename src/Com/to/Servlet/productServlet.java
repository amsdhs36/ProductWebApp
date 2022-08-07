package Com.to.Servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Com.to.connect.dbaseConnect;
import Com.to.dao.productdao;
import Com.to.data.product;

/**
 * Servlet implementation class productServlet
 */
@WebServlet("/product")
public class productServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
	//	PrintWriter out=response.getWriter();
		Connection con2=dbaseConnect.createConnection();
		List<product>list=new ArrayList<>();
		
		 
			   try {
				list=productdao.queryProduct(con2);
			   } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			    
		   request.setAttribute("productList", list); 	
	       RequestDispatcher rd=request.getRequestDispatcher("products.jsp");
	       rd.forward(request, response);
	    
	}
}	
	
	



