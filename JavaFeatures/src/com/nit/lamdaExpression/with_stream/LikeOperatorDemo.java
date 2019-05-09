package com.nit.lamdaExpression.with_stream;

import java.util.ArrayList;
import java.util.List;

public class LikeOperatorDemo {

	public static void main(String[] args) {
		
		List<Product> products = new  ArrayList<Product>();
		products.add(new Product("p1","mobile 1",1000,2,"Manufacture 1"));
		products.add(new Product("p2","mobile 2",44,3,"Manufacture 2"));
		products.add(new Product("p3","laptop 2",555,3,"Manufacture 2"));
		products.add(new Product("p2","laptop 2",800,4,"Manufacture 5"));
		products.add(new Product("p4","TV 5",255,4,"Manufacture 2"));
		products.add(new Product("p5","TV 7",666,6,"Manufacture 6"));
		
		System.out.println("Search start with: mo");
		
		products.stream().filter(product -> product.getName().startsWith("mo"))
		.forEach(product -> {
			System.out.println(product.toString());
			System.out.println("=========================");
		});
		
		System.out.println("Search end with : top");
		products.stream().filter(product -> product.getName().endsWith("p 2"))
		.forEach(product -> {
			System.out.println(product.toString());
			System.out.println("===============================");
		});
		
		System.out.println("Search contains : v");
		products.stream().filter(product -> product.getName().contains("V"))
		.forEach(product ->{
			System.out.println(product.toString());
			System.out.println("================");
		});
	}

}
