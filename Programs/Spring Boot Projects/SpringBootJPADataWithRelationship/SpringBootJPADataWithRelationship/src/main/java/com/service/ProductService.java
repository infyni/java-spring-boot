package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.orm.ProductRepository;


@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	public String storeProdcut(Product product) {
			Optional<Product> result = 	productRepository.findById(product.getPid());	// pre defined method 
			if(result.isPresent()) {	
				return "Product id must be unique";
			}else {
				productRepository.save(product);				// pre defined method new record insert 
				return "Product stored";
			}
	}
	
	public String deleteProduct(int pid) {
		Optional<Product> result = 	productRepository.findById(pid);	// pre defined method 
		if(result.isPresent()) {
			productRepository.deleteById(pid);			// pre defined method 
			return "Product deleted successfully";
		}else {
			return "Product not present";
		}
	}
	
	
	public Product searchProduct(int pid) {
		Optional<Product> result = 	productRepository.findById(pid);	// pre defined method 
		if(result.isPresent()) {
			Product p = result.get();
			return p;
		}else {
			return null;
		}
	}
	
	
	public String updateProduct(Product product) {		// pid and price 
		Optional<Product> result = 	productRepository.findById(product.getPid());	// pre defined method 
		if(result.isPresent()) {
			Product productFromDb = result.get();			// get product details from database it contains old id,pname, price 
			productFromDb.setPrice(product.getPrice());   	// replace old value by new value 
			
			productRepository.saveAndFlush(productFromDb);		// update the record , update existing records 
			return "Product updated successfully";
		}else {
			return "Product not present";
		}
	}
	
	public List<Product> findAllProduct() {
			return productRepository.findAll();			// findAll pre defined method part of JpaRepository 
	}
}
