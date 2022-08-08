package Com.to.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Com.to.connect.dbaseConnect;
import Com.to.data.product;

/**
 * Servlet implementation class productData
 */
@WebServlet("/productData")
public class productData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public productData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
			
			String ID=request.getParameter("p_id");
			
			int p_id=Integer.parseInt(ID);
		//	boolean status=false;
			PreparedStatement ps1=null;
			
				   try {
					   Connection con4=dbaseConnect.createConnection();
					   String query = "Select p_id,pname,p_desc,price from product where p_id=?";				
					    ps1 = con4.prepareStatement(query);
					    ps1.setInt(1, p_id);
					    					    
					    ResultSet rs= ps1.executeQuery();
			   		   // status=rs.next();	   		        
					  
					   if (rs.next()) {
						   product pdata=new product();
						   pdata.setP_id(rs.getInt(1));
						   pdata.setPname(rs.getString(2));
						   pdata.setP_desc(rs.getString(3));
						   pdata.setPrice(rs.getFloat(4));
					 
					HttpSession session=request.getSession();
					session.setAttribute("pdata", pdata);
				       RequestDispatcher rd=request.getRequestDispatcher("productdata.jsp");
		               rd.forward(request, response);
		    
		             }
					   else { 
				    	request.setAttribute("emessage", "Product ID does not exist");
					    RequestDispatcher rd=request.getRequestDispatcher("products.jsp");
					    rd.forward(request, response);		    
					   }  }catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				   out.close();
				
	}

}


