package com.iws.annomus.expression;

interface wayInter {

	public void withDraw(int amt);
}

class wayClass implements wayInter {
	public void withDraw(int amt) {
		System.out.println("Amount WithDraw is ==>" + amt);
	}

}

public class Way01 {

	public static void main(String[] args) {

		wayInter way = new wayClass();
		way.withDraw(100);
	}
}
