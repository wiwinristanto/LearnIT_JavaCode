package com.learnIT.Array;

import java.beans.JavaBean;

public class MultyDimesionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Java program to illustrate the use of multydimensional array
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		//Print 2D array
		for (int i =0; i < arr.length; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j]+ " ");
				//output yg dihasilkan dibaca seperti ini
//				arr[0][0]=1;  
//				arr[0][1]=2;  
//				arr[0][2]=3;  
//				arr[1][0]=4;  
//				arr[1][1]=5;  
//				arr[1][2]=6;  
//				arr[2][0]=7;  
//				arr[2][1]=8;  
//				arr[2][2]=9;
			}
			System.out.println();
		}
	
	}
	
}
