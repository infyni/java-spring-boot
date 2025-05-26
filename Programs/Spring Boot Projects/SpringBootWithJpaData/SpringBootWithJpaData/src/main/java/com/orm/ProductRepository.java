package com.orm;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bean.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	// it provide set of method base upon java 8 features 
}
