package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.bean.Product;

@Repository
public class ProductDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public int storeProduct(Product product) {
		try {
			return jdbcTemplate.update("insert into product values(?,?,?)", product.getPid(),product.getPname(),product.getPrice());
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}
	
	public int deleteProduct(int pid) {
		try {
			return jdbcTemplate.update("delete from product where pid=?", pid);
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}
	
	public int updateProduct(Product product) {
		try {
			return jdbcTemplate.update("update product set price = ? where pid=?", product.getPrice(),product.getPid());
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}
	
	public List<Product> findProducts() {
		try {
			return jdbcTemplate.query("select * from product", new MyRowMapper());
		} catch (Exception e) {
			System.err.println(e);
		}
		return null;
	}
}


class MyRowMapper implements RowMapper<Product>{
	// method is responsible to convert each record as object like global while loop 
	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Product p = new Product();
		p.setPid(rs.getInt(1));
		p.setPname(rs.getString(2));
		p.setPrice(rs.getFloat(3));
		return p;
	}
}
