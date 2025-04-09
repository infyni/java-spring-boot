package com;
import java.sql.*;
import java.util.Scanner;
public class DemoTest {

	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");	
		System.out.println("Driver loaded successfully");
	Connection con = 
	DriverManager.getConnection("jdbc:mysql://localhost:3306/infyni", "root", "root@123");
	System.out.println("Connected successfully");
	Statement stmt = con.createStatement();
	System.out.println("Statment is ready..");
		// Insert Query 
//		int result = stmt.executeUpdate("insert into product values(103,'Pen Drive',1400)");
//		if(result>0) {
//			System.out.println("Record inserted successfully");
//		}
	
		// update query 
	
//		int result = stmt.executeUpdate("update product set price = 67000 where pid=100");
//		if(result>0) {
//			System.out.println("Record updated successfully");
//		}else {
//			System.out.println("Record not present");
//		}
	
		// delete query 
	
//	int result = stmt.executeUpdate("delete from product where pid=100");
//	if(result>0) {
//		System.out.println("Record deleted successfully");
//	}else {
//		System.out.println("Record not present");
//	}
//	
		// Retrieve query 
//		ResultSet rs = stmt.executeQuery("select * from product");
//		while(rs.next()) {
//			//System.out.println("pid is "+rs.getInt(1)+" PName "+rs.getString(2)+" Price "+rs.getFloat(3));
//			System.out.println("pid is "+rs.getInt("pid")+" PName "+rs.getString("pname")+" Price "+rs.getFloat("price"));
//		}

		Scanner sc  = new Scanner(System.in);
		// Insert Query using PreparedStatement 
//		PreparedStatement pstmt = con.prepareStatement("insert into product values(?,?,?)");
//		System.out.println("Enter the product id");
//		int pid = sc.nextInt();
//			pstmt.setInt(1, pid);
//		
//		System.out.println("Enter the product name");
//		String pname= sc.next();
//			pstmt.setString(2, pname);
//		
//		System.out.println("Enter the price");
//		float price = sc.nextFloat();
//			pstmt.setFloat(3, price);
//		
//		int result = pstmt.executeUpdate();
//		if(result>0) {
//			System.out.println("Record inserted successfully");
//		}
		
//		// delete query using prepared statement 
//		
//		PreparedStatement pstmt = con.prepareStatement("delete from product where pid=?");
//		System.out.println("Enter the product id");
//		int pid = sc.nextInt();
//		pstmt.setInt(1, pid);
//		
//		int result = pstmt.executeUpdate();
//		if(result>0) {
//			System.out.println("Record deleted successfully");
//		}else {
//			System.out.println("Record not present");
//		}
		
		
		// update query using prepared statement 
		
//				PreparedStatement pstmt = con.prepareStatement("update product set price = ? where pid=?");
//				System.out.println("Enter the product id");
//				int pid = sc.nextInt();
//				pstmt.setInt(2, pid);
//				
//				System.out.println("Enter the new price");
//				float price = sc.nextFloat();
//				pstmt.setFloat(1, price);
//				
//				int result = pstmt.executeUpdate();
//				if(result>0) {
//					System.out.println("Record updated successfully");
//				}else {
//					System.out.println("Record not present");
//				}
		// ResultSet with PreparedStatement 
		PreparedStatement pstmt = con.prepareStatement("select * from product where price > ?");
		System.out.println("Enter the product product price");
		float price = sc.nextFloat();
		pstmt.setFloat(1, price);	
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			System.out.println("pid is "+rs.getInt("pid")+" PName "+rs.getString("pname")+" Price "+rs.getFloat("price"));
		}
		// close the resource 
		//rs.close();
		stmt.close();
		con.close();
		} catch (Exception e) {
		System.err.println(e);
		}

	}

}
