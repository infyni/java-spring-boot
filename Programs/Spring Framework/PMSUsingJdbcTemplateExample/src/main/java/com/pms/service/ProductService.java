package com.pms.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pms.bean.Product;
import com.pms.dao.ProductDao;

@Service				// service layer annotation by default is is productService
public class ProductService {

	
	@Autowired
	ProductDao productDao;	
	
	public String storeProduct(Product product) {
			if(product.getPrice()<0) {
				return "Product price must +ve";
			}else if(productDao.storeProduct(product)>0) {
				return "product details stored successfully";
			}else {
				return "Product not present";
			}
	}
	
	public String deleteProduct(int pid) {
		if(productDao.deleteProduct(pid)>0) {
			return "product deleted";
		}else {
			return "product not present";
		}
	}
	
	public String updateProduct(Product product) {
		if(productDao.updateProduct(product)>0) {
			return "product updated";
		}else {
			return "product not present";
		}
	}
	
	public List<Map<String, Object>> findAllProducts() {
		return productDao.findAllProducts();
	}
}
