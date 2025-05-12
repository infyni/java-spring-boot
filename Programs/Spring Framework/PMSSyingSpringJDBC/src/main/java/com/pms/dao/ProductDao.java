
package com.pms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pms.bean.Product;

@Repository			// dao layer specific annotation by default id is productDao
public class ProductDao {

	@Autowired
	DataSource dataSource;			// it search database details if present automatically do the di for that 
							// data source using concept as byType. if 2 database configuration 
						// details present in beans.xml file then you need to use byName that time 
							// id name and reference must be match. 
	public int storeProduct(Product product) {
		try {
			Connection con = dataSource.getConnection();		// load the driver and establish the connection 
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
	public List<Product> findAllProducts() {
		List<Product> listOfProducts = new ArrayList<Product>();
		try {
			Connection con = dataSource.getConnection();		// load the driver and establish the connection 
		PreparedStatement pstmt = con.prepareStatement("select * from product");
		ResultSet rs  = pstmt.executeQuery();
		while(rs.next()) {
			Product p = new Product();			// convert each record into java objects. 
			p.setPid(rs.getInt(1));
			p.setPname(rs.getString(2));
			p.setPrice(rs.getFloat(3));
			listOfProducts.add(p);
		}
		} catch (Exception e) {
			System.err.println(e);
		}
		return listOfProducts;
	}
}
