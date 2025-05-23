package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.bean.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

@Repository
public class ProductDao {

//	@Autowired
//	JdbcTemplate jdbcTemplate;
	
	@Autowired
	EntityManagerFactory emf;
	
	public int storeProduct(Product product) {
		try {
			EntityManager manager = emf.createEntityManager();
			EntityTransaction tran = manager.getTransaction();
			tran.begin();
				manager.persist(product);
			tran.commit();
			return 1;
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}
	
	public int deleteProduct(int pid) {
		
			EntityManager manager = emf.createEntityManager();
			EntityTransaction tran = manager.getTransaction();
			Product p = manager.find(Product.class, pid);
			if(p==null) {
				return 0;
			}else {
				tran.begin();
					manager.remove(p);
				tran.commit();
				return 1;
			}
					
		
	}
	
	public int updateProduct(Product product) {
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		Product p = manager.find(Product.class, product.getPid());
		if(p==null) {
			return 0;
		}else {
			tran.begin();
			p.setPrice(product.getPrice());
				manager.merge(p);
			tran.commit();
			return 1;
		}
	}
	
	public List<Product> findProducts() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery("select p from Product p");		// using JPQL 
		List<Product> listOfProduct  = qry.getResultList();
		return listOfProduct;
	}
}


