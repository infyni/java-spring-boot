package com.service;

import java.util.Iterator;
import java.util.List;

import com.bean.Product;
import com.dao.ProductDao;

public class ProductService {
	ProductDao pd = new ProductDao();
	
	public String storeProduct(Product product) {
		if(product.getPrice()<0) {
			return "Price must be +ve";
			
		}else 
			if(pd.storeProduct(product)>0) {
			return "Product stored successfully";
		}else {
			return "Product didn't store";
		}
	}
	public String updateProduct(Product product) {
		// business logic if you need you write example new price must be > old price 
		if(pd.updateProductPrice(product)>0) {
			return "Product updated successfully";
		}else {
			return "Product not present";
		}
	}
	
	public String deleteProduct(int pid) {
		if(pd.deleteProduct(pid)>0) {
			return "Product deleted successfully";
		}else {
			return "Product not present";
		}
	}
	
	public String findProduct(int pid) {
		Product p = pd.findProduct(pid);
		if(p==null) {
			return "Product not present in db";
		}else {
			return p.toString();    // return product details in string format. 
		}
	}
	
	public List<Product> findAllProducts() {
		List<Product> listOfProduct = pd.findAllProducts();
		// apply discount 
		Iterator<Product> li = listOfProduct.iterator();
		while(li.hasNext()) {
			Product p  = li.next();
			float discount = 0.10f;	
			p.setPrice(p.getPrice()-discount);
		}
		return listOfProduct;
	}
}
