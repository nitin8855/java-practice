package com.nit.lamdaExpression;

import java.util.ArrayList;
import java.util.List;

public class Test  {

	

	public static void main(String[] args) {
		Test test = new Test();
		test.testMethod();
	}

	private void testMethod() {
		List<String> list = new ArrayList<String>();
		list.add("Nitin");
		list.add("Sonwane");
		
		list.forEach(
			System.out::println
		);
	}

}
