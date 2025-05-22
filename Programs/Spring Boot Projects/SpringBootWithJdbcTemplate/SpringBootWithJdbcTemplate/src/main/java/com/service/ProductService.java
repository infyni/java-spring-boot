package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.dao.ProductDao;

@Service
public class ProductService {

	@Autowired
	ProductDao productDao;
	
	public String storeProdcut(Product product) {
		if(productDao.storeProduct(product)>0) {
			return "Product stored";
		}else {
			return "Product didn't store";
		}
	}
}
