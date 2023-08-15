package com.test.initial.assignment;

public class Learn {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		int m = mul(1, 2);
		int z = add(a, b);
		int l = sub(a, b);
		String punch = collection(a);

		System.out.println(z);
		System.out.println(m);
		System.out.println(a + b);
		System.out.println(l);
		System.out.println(punch);

	}

	public static int mul(int i, int j) {
		return i * j;
	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int sub(int a, int b) {
		int r = a - b;
		return r;

	}

	public static String collection(int a) {
		return " \"This is java first class\"";
	}
}
