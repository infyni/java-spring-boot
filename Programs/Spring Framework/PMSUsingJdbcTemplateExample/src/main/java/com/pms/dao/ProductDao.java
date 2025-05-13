
package com.pms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pms.bean.Product;

@Repository			// dao layer specific annotation by default id is productDao
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
	public List<Map<String, Object>> findAllProducts() {
		try {
		return jdbcTemplate.queryForList("select * from product");
		}catch(Exception e) {
			System.out.println(e);
			return null;
		}
	}
	

}
