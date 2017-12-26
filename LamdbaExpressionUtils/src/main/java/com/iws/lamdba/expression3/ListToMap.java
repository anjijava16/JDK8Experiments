package com.iws.lamdba.expression3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {

	public static void main(String[] args) {

		List<Account> li = new ArrayList<Account>();

		Account ac1 = new Account(100, "Savings", "Open");
		Account ac2 = new Account(101, "Checking", "Closed");

		li.add(ac1);
		li.add(ac2);

		Map<Integer, String> beforeJava8 = new HashMap<>();
		for (Account acc : li) {
			beforeJava8.put(acc.getAccNo(), acc.getAccStatus());
		}
		
		System.out.println("jdk 8 before =>"+beforeJava8);

		
		Map<Integer, String> map = li.stream().collect(Collectors.toMap(x -> x.getAccNo()  , x -> x.getAccStatus()));
		 System.out.println("Java 8 "+map);
		 
		 
		 
	}
}
