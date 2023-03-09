package com.learnIT.Array;

public class ReturnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calling method which return an array
		int arr[]=get();
		//printing the value of an array
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
		
	}
	
	static int[] get() {
		return new int[] {10,30,50,90,60};
	}

}
