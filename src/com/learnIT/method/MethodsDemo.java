package com.learnIT.method;


public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = sum(1, 10);
		printToConsole(sum);
		printToConsole(sum(2.1, 3.1));
		printToConsole("Some Text");


	}
	
	private static int sum(int i1, int i2) {
		// TODO Auto-generated method stub
		int result = i1 + i2;
		return result;
	}
	

	private static double sum(double d1, double d2) {
		// TODO Auto-generated method stub
		return d1 + d2 ;
	}
	

	private static void printToConsole(String text) {
		// TODO Auto-generated method stub
		System.out.println(text);
	}
	
	private static void printToConsole(int i) {
		// TODO Auto-generated method stub
		System.out.println(i);
		
	}
	
	private static void printToConsole(double d) {
		// TODO Auto-generated method stub
		System.out.println(d);
		
	}


	

}
