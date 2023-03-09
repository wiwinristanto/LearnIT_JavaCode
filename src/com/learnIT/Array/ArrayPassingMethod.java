package com.learnIT.Array;

public class ArrayPassingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//call method min
		int a[]= {33,3,4,5}; // declaring and initilizing an array
		min(a);//passing array to method
		
		
	}
	//Java program to demonstrate the way of passing an array to method
	public static void min(int arr[]) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++)
			if(min > arr[i])
				min = arr[i];
		System.out.println(min);
	}

}
