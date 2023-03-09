package com.learnIT.Array;

public class TestArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5]; //declaration and instantiation
		
		a[0]=10; //initialization 1
		a[1]=20; //initialization 2
		a[2]=70; //initialization 3
		a[3]=40; //initialization 4
		a[4]=50; //initialization 5
		
		//traversing array
		for (int i = 0; i < a.length; i++)//length is the property of array
			System.out.println(a[i] + " " +i);

	}

}
