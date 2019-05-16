package com.nit.CRUD_Opration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.CRUD_Opration.config.AppConfig;
import com.nit.CRUD_Opration.service.ProductService;


public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	ProductService pService = null;
    	ApplicationContext context = null;

        context = new AnnotationConfigApplicationContext(AppConfig.class);
        pService = context.getBean("productService",ProductService.class);
        System.out.println("ALL Product::"+pService.allProduct());
        
       // Product product = new Product();
       // System.out.println("Save Product::"+pService.saveProduct(product));
       // System.out.println(pService.removeProductById(4));
       // System.out.println("Your Product::"+pService.dispalyProductById(3));
        
        
    }
}
