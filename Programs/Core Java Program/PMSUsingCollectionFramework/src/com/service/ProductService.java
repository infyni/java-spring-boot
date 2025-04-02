package com.service;

import java.util.ArrayList;
import java.util.List;

import com.bean.Product;

public class ProductService {

	
	// business methods 
	List<Product> listOfProduct = new ArrayList<Product>();
	
	public String addProduct(Product product) {
				// before we can apply some business logic when we need to add. 
			listOfProduct.add(product);
			return "Product added successfully";
	}
	
	public List<Product> dispayProduct() {
		return listOfProduct;
	}
	
	public void deleteProduct() {
		
	}
	public void updateProductPrice() {
		
	}
}
