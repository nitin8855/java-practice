package com.nit.lamdaExpression.with_stream;

import java.util.ArrayList;
import java.util.List;

public class LimitOperatorDemo {

	public static void main(String[] args) {
		List<Product> products = new  ArrayList<Product>();
		products.add(new Product("p1","mobile 1",1000,2,"Manufacture 1"));
		products.add(new Product("p2","mobile 2",44,3,"Manufacture 2"));
		products.add(new Product("p3","laptop 2",555,3,"Manufacture 2"));
		products.add(new Product("p2","laptop 2",800,4,"Manufacture 5"));
		products.add(new Product("p4","TV 5",255,4,"Manufacture 2"));
		products.add(new Product("p5","TV 7",666,6,"Manufacture 6"));
		
		System.out.println("Ascending order");
		products.stream().sorted((p1,p2) -> (int)(p1.getPrice()- p2.getPrice()))
		.limit(3)
		.forEach(p -> {
			System.out.println(p.toString());
			System.out.println("=========================");
		});
		
		System.out.println("Descending order");
		products.stream().sorted((p1,p2) -> (int)(p2.getPrice() - p1.getPrice()))
		.limit(2)
		.forEach(product-> {
			System.out.println(product.toString());
			System.out.println("===================");
		});

	}

}
