package com.iws.annomus.expression;

interface Lam {
	public void withDraw(int amt);
	// public void dep(); // we can't write more than one method //The target
	// type of this expression must be a functional interface
}

interface Add {

	public String sayHello(String name);
}

public class LambadExpression {

	public static void main(String[] args) {

		Lam l = (int amt) -> {

			System.out.println("Lambad AMT=>" + amt);
		};

		l.withDraw(100);

		Add a = (String name) -> {
			System.out.println("Welcome to Lambad ==>" + name);
			return name;
		};
		String res=a.sayHello("anji");
		
		System.out.println(res);
	}
}
