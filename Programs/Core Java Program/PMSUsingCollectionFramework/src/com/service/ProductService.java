package com.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.bean.Product;

public class ProductService {

	
	// business methods 
	List<Product> listOfProduct = new ArrayList<Product>();
	
	public String addProduct(Product product) {
				// before we can apply some business logic when we need to add. 
			int flag = 0;
			if(listOfProduct.size()==0) {
				listOfProduct.add(product);
				return "Product added successfully";
			}else {
				Iterator<Product> li = listOfProduct.iterator();
				while(li.hasNext()) {
					Product p = li.next();
					if(p.getPid()==product.getPid()) {
						flag++;
						break;
					}
				}
			}
			
			if(flag==0) {
				listOfProduct.add(product);
				return "Product added successfully";
			}else {
				return "Product id must be unique";
			}
	}
	
	public List<Product> dispayProduct() {
		return listOfProduct;
	}
	
	public String deleteProduct(int pid) {
			int flag = 0;
		
			Iterator<Product> li = listOfProduct.iterator();
			while(li.hasNext()) {
				Product p = li.next();
				if(p.getPid()==pid) {
					li.remove();    // remove that product 
					flag++;
					break;
				}
			}
		
		
		if(flag==0) {
			return "Product not present";
		}else {
			return "Product deleted successfully";
			
		}
	}
	public String updateProductPrice(Product product) {		// pid name price 100, 45000 new price 48000
			int flag = 0;
			
			Iterator<Product> li = listOfProduct.iterator();
			while(li.hasNext()) {
				Product p = li.next();
				if(p.getPid()==product.getPid()) {
					p.setPrice(product.getPrice());         // replace with new price 
					flag++;
					break;
				}
			}
		
		
		if(flag==0) {
			return "Product not present so din't update";
		}else {
			return "Product price updated successfully";
		}
	}
}
