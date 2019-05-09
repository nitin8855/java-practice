package com.nit.lamdaExpression.with_stream;

import java.util.List;
import java.util.ArrayList;

public class FilterDemo {

	public static void main(String[] args) {
		
		List<Product> products = new  ArrayList<Product>();
		products.add(new Product("p1","mobile 1",1000,2,"Manufacture 1"));
		products.add(new Product("p2","mobile 2",44,3,"Manufacture 2"));
		products.add(new Product("p3","laptop 2",555,3,"Manufacture 2"));
		products.add(new Product("p2","laptop 2",800,4,"Manufacture 5"));
		products.add(new Product("p4","TV 5",255,4,"Manufacture 2"));
		products.add(new Product("p5","TV 7",666,6,"Manufacture 6"));
		
		System.out.println("Or Condition");
		products.stream().filter(product -> product.getId().equalsIgnoreCase("p2") || product.getId().equalsIgnoreCase("p4"))
		.forEach(product -> {
			System.out.println(product.toString());
			System.out.println("========================");
		});
		
		System.out.println("And Condition");
		products.stream().filter(product -> product.getPrice() > 200 && product.getPrice() < 800)
		.forEach(product -> {
			System.out.println(product.toString());
			System.out.println("=========================");
		});
	}

}
