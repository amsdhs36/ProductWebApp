package Com.to.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Com.to.data.product;

public class productdao {
	public static List<product> queryProduct(Connection con2) throws SQLException {
		String query = "Select * from product";

		PreparedStatement ps = con2.prepareStatement(query);

		ResultSet rs = ps.executeQuery();
		List<product> list = new ArrayList<>();
		while (rs.next()) {
			int p_id = rs.getInt("p_id");
			String pname = rs.getString("pname");
			float price = rs.getFloat("price");
			String p_desc=rs.getString("p_desc");
			product product = new product();
			product.setP_id(p_id);
			product.setPname(pname);
			product.setPrice(price);
			product.setP_desc(p_desc);
			list.add(product);
		}
		return list;
}
	
}	 
			
	

