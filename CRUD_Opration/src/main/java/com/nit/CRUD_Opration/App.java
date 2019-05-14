package com.nit.CRUD_Opration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.CRUD_Opration.config.AppConfig;
import com.nit.CRUD_Opration.service.ProductService;

/**
 * Hello world!
 *
 */


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
        
        
    }
}
