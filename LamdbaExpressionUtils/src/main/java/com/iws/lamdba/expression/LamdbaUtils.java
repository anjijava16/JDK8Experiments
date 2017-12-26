package com.iws.lamdba.expression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LamdbaUtils {

	public static void main(String[] args) {

		List<String> alphabets = new ArrayList<String>(Arrays.asList("aa",
				"bbb", "cat", "dog"));

		  alphabets.forEach(ref -> System.out.println(ref));

		alphabets.forEach(System.out::println);

		alphabets.forEach(s->System.out.print(s+" "));
		
	    alphabets.stream().forEach(System.out::println);
		  
		System.out.println("====");
		
		alphabets.stream().filter(s -> s.startsWith("a"))
				.forEach(System.out::println);
	
	
		
		System.out.println("Size above 2 here is stared ");
		
		alphabets.stream().filter(x->x.length()>2).forEach(System.out::println);
		
		System.out.println("Size above 2 here is ended ");
		
		
		System.out.println("Comparing bbb is equal or not stared here ");
		alphabets.stream().filter(x->x.equals("bbb")).forEach(res->System.out.println(res));
		System.out.println("Comparing bbb is equal or not ended here ");	
		
		
		alphabets.stream().mapToInt(x->x.length()).sum();
		
		
		 alphabets.stream()
         .mapToInt(s -> s.length())
         .sum();
		 
		 
		 alphabets.stream()
         .mapToInt(s -> s.length())
         .forEach(System.out::println);
		
	}
}
