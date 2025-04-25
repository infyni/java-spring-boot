package com.pms.service;

import java.util.List;

import com.pms.bean.Product;
import com.pms.dao.ProductDao;

public class ProductService {
	
	ProductDao pd = new ProductDao();
	
	public String storeProduct(Product product) {
		if(product.getPrice()<100) {
			return "Price must be >100";
		}else if(pd.storeProduct(product)>0){
			return "Product stored succcessfully";
		}else {
			return "Product didn't store";
		}
	}
	
	public String deleteProduct(int pid) {
		if(pd.delete(pid)>0) {
			return "Product deleted successfully";
		}else {
			return "Product didn't delete";
		}
	}
	public String updateProduct(Product product) {
		if(pd.updateProduct(product)>0) {
			return "Product updated successfully";
		}else {
			return "Product didn't update";
		}
	}
	
	public List<Product> findAllProducts() {
		return pd.findProduct();
	}
}
