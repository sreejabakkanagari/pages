package com.cg.spring.boot.jpa.springbootdatajpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;
	
	@RequestMapping("/products")
	public List<Product> getAllProducts()
	{
		return productService.getAllProducts();
	}
	
	@RequestMapping("/products/{id}")
	public Optional<Product> getProduct(@PathVariable String id)
	{
		return productService.getProduct(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value = "/products")
	public void addProduct( Product p)
	{
		productService.addProduct(p);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value = "/products/delete/{id}")
	public void deleteProduct(@PathVariable String id)
	{
		productService.deleteProduct(id);
	}
}
