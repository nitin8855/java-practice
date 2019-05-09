package com.nit.lamdaExpression.with_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByDemo {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<Product>();
		products.add(new Product("p1", "mobile 1", 1000, 2, "Manufacture 1"));
		products.add(new Product("p2", "mobile 2", 44, 3, "Manufacture 2"));
		products.add(new Product("p3", "laptop 2", 555, 3, "Manufacture 2"));
		products.add(new Product("p2", "laptop 2", 800, 4, "Manufacture 5"));
		products.add(new Product("p4", "TV 5", 255, 4, "Manufacture 2"));
		products.add(new Product("p5", "TV 7", 666, 6, "Manufacture 6"));
		
		System.out.println("COunt number of product in each group:::");
		Map<String, Long> group = products.stream().collect(Collectors.groupingBy(Product::getManufacture, Collectors.counting()));
		
		for(String groupName : group.keySet()) {
			System.out.println("Group name::"+ groupName);
			System.out.println("product: "+ group.get(groupName));
			System.out.println("=================================");
		}
		
		System.out.println("Count total number of product in each group");
		Map<String, Integer> calculateGroup = products.stream().collect(Collectors.groupingBy(Product::getManufacture, Collectors.summingInt(Product::getQuantity)));
		
		for(String groupName : calculateGroup.keySet()) {
			System.out.println("Group Name::" + groupName);
			System.out.println("Total number of product::" + group.get(groupName));
			System.out.println("=================================");
		}
		
	}

}
