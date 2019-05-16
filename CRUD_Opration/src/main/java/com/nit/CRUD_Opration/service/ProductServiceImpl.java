package com.nit.CRUD_Opration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.CRUD_Opration.dao.ProductDAOImpl;
import com.nit.CRUD_Opration.domain.Product;

@Service("productService")
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductDAOImpl productDAOImpl;

	public List<Product> allProduct() {
		return productDAOImpl.listAll();
	}

	public String saveProduct(Product product) {
		//Product product = new Product();
		// product.setId(7);
		product.setName("Samasung Mobile");
		product.setPrice(15000);
		product.setQuantity(10);
		product.setDescription("This is Samsung product");
		product.setPhoto("samsung.jpg");
		product.setAvailable(true);

		return productDAOImpl.insertProduct(product);
	}

	public String removeProductById(int id) {
		return productDAOImpl.deleteProductById(id);
	}

	public Product dispalyProductById(int id) {
		Product byID = productDAOImpl.getByID(id);
		return byID;
	}
}
