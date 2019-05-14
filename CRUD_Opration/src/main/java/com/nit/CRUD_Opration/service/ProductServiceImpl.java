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
	
//	public void setProductDAOImpl(ProductDAOImpl productDAOImpl) {
//		this.productDAOImpl = productDAOImpl;
//	}

	@Override
	public List<Product> allProduct() {
		return productDAOImpl.listAll();
	}

}
