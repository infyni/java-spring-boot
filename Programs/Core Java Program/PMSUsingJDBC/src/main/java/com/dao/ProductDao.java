package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Product;
import com.resource.DbResource;

public class ProductDao {

	public int storeProduct(Product product) {
		try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/infyni", "root", "root@123");
	Connection con  = DbResource.getDbConnection();
	PreparedStatement pstmt = con.prepareStatement("insert into product values(?,?,?)");
	pstmt.setInt(1, product.getPid());
	pstmt.setString(2, product.getPname());
	pstmt.setFloat(3, product.getPrice());
	return pstmt.executeUpdate();
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}
	public int updateProductPrice(Product product) {
		try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/infyni", "root", "root@123");
			Connection con  = DbResource.getDbConnection();
	PreparedStatement pstmt = con.prepareStatement("update product set price = ? where pid=?");
	pstmt.setInt(2, product.getPid());
	pstmt.setFloat(1, product.getPrice());
	return pstmt.executeUpdate();
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}
	public int deleteProduct(int pid) {
		try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/infyni", "root", "root@123");
			Connection con  = DbResource.getDbConnection();
	PreparedStatement pstmt = con.prepareStatement("delete from product where pid=?");
	pstmt.setInt(1, pid);
	return pstmt.executeUpdate();
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}
	public Product findProduct(int pid) {
		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/infyni", "root", "root@123");
			Connection con  = DbResource.getDbConnection();
		PreparedStatement pstmt = con.prepareStatement("select * from product where pid=?");
		pstmt.setInt(1, pid);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {						//  101 | Computer | 59000 
			Product p1 = new Product();		// converting sql query data into object format. 
			p1.setPid(rs.getInt(1));
			p1.setPname(rs.getString(2));
			p1.setPrice(rs.getFloat(3));
			return p1;			//hold 101, computer and 59000 price if we pass pid as 101 
		}else {
			return null;
		}
			} catch (Exception e) {
				System.err.println(e);
				return null;
			}
	}
	
	public List<Product> findAllProducts() {
		List<Product> listOfProducts = new ArrayList<Product>();
		try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/infyni", "root", "root@123");
			Connection con  = DbResource.getDbConnection();
		PreparedStatement pstmt = con.prepareStatement("select * from product");
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {						
			Product p1 = new Product();		
			p1.setPid(rs.getInt(1));
			p1.setPname(rs.getString(2));
			p1.setPrice(rs.getFloat(3));
			listOfProducts.add(p1);			// first product stored, second product store, third product store like till nth product 	
			}
			} catch (Exception e) {
				System.err.println(e);
			}
		return listOfProducts;
	}
}
