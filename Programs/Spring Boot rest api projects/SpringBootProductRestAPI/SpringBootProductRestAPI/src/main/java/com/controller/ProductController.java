package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Product;
import com.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;
	
	// http://locahost:8080/findAllProducts
	
	@RequestMapping(value = "findAllProducts",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> findAllProducts() {
		return productService.findAllProducts();
	}
	
	// http://localhost:8080/findProductByQuery?pid=100
	
	@RequestMapping(value = "findProductByQuery",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public Product findProductUsingQueryParam(@RequestParam("pid") int productid) {
		return productService.findProduct(productid);
	}
	
	// http://localhost:8080/findProductByPath/100
	
	@RequestMapping(value = "findProductByPath/{pid}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public Product findProductUsingPathParam(@PathVariable("pid") int productid) {
		return productService.findProduct(productid);
	}
	
	
	// http://localhost:8080/findProductByPrice/42000
	
		@RequestMapping(value = "findProductByPrice/{price}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
		public List<Product> findProductByPrice(@PathVariable("price") float price) {
			return productService.findProductUsingprice(price);
		}
	
	// http://localhost:8080/storeProduct
	// method must be post 
	// data in the form of json {"pid":101,"pname":"Pen Drive","price":1600}
	// post data always send to request body part
	
	@RequestMapping(value = "storeProduct",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeProduct(@RequestBody Product product) { // @RequestBody annotation is use to extract data from request body 
		System.out.println(product);   // call toString method make sure override to String method in product class. 
		//return "ready to store";
		return productService.storeProduct(product);
	}
	
	// http://localhost:8080/updateProduct
		// method must be put
		// data in the form of json {"pid":101,"price":1650}
		// put data always send to request body part
	
	@RequestMapping(value = "updateProduct",method = RequestMethod.PUT,consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateProduct(@RequestBody Product product) { // @RequestBody annotation is use to extract data from request body 
		System.out.println(product);   // call toString method make sure override to String method in product class. 
		//return "ready to store";
		return productService.updateProduct(product);
	}
	
	// http://localhost:8080/deleteProduct/100
	
	@RequestMapping(value = "deleteProduct/{pid}",method = RequestMethod.DELETE)
	public String deleteProduct(@PathVariable("pid") int productid) {
		return productService.deleteProduct(productid);
	}
}
