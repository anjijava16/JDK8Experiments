package com.iws.lamdba.expression2;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class LambdaUtils {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 10, 13, 4);
		list.forEach(res -> System.out.println(res));
		
		//list.forEach(System.out::println);

		System.out.println("==========================================");
		
		List<Integer> square = list.stream().map(x -> x * 2)
				.collect(Collectors.toList());
		square.forEach(res -> System.out.println(res));
		
		
		Random random = new Random();
		random.ints().limit(10).forEach(System.out::println);

	}
}
