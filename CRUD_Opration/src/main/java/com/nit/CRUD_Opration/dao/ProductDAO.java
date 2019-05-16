package com.nit.CRUD_Opration.dao;

import java.util.List;

import com.nit.CRUD_Opration.domain.Product;

public interface ProductDAO {
	
	public List<Product> listAll();
	public String insertProduct(Product product);
	public String deleteProductById(int id);
	public Product getByID(int id); 
}
