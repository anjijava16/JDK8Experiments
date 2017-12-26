package com.iws.annomus.expression;

interface ann01 {

	public void withDraw(int amt);
}

public class AnonmusInnerClass {

	public static void main(String[] args) {

		ann01 ans = new ann01() {// Anonoums Inner Class

			public void withDraw(int amt) {

				System.out.println("Amt is Lambad =>" + amt);
			}
		};
		ans.withDraw(100);
	}// OBject
}
