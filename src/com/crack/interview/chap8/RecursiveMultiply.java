package com.crack.interview.chap8;

public class RecursiveMultiply {
	
	public static void main(String[] args){
		System.out.println(minProduct(7,9));
	}

	static int minProduct(int a, int b) {
		int bigger = a < b ? b : a;
		int smaller = a < b ? a : b;
		return minProductHelper(smaller, bigger);
	}

	static int minProductHelper(int smaller, int bigger) {

		if (smaller == 0)
			return 0;

		else if (smaller == 1)
			return bigger;

		int s = smaller >> 1; // Divide by 2

		int halfProd = minProductHelper(s, bigger);

		if (smaller % 2 == 0) {

			return halfProd + halfProd;

		} else {

			return halfProd + halfProd + bigger;

		}

	}
}