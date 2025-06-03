package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

	// custom query, we need to use JPQL 
	
	@Query("select p from Product p where p.price > :price")
	public List<Product> findProductByPrice(@Param("price") float price);
}
