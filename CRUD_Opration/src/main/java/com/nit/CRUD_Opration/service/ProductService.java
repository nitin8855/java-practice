package com.nit.CRUD_Opration.service;

import java.util.List;

import com.nit.CRUD_Opration.domain.Product;

public interface ProductService {

	public List<Product> allProduct();
	public String saveProduct(Product product);
	public String removeProductById(int id);
	public Product dispalyProductById(int id);
}
