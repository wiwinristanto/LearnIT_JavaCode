package com.learnIT.Array;

public class GetNameClassArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Java program to get the class name of array in java
		int arr[]= {4,4,5};
		//getting the class name of java array
		Class class1=arr.getClass();
		String name  = class1.getName();
		//printing the class name of array
		
		System.out.println(name);

	}

}
