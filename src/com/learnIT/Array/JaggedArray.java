package com.learnIT.Array;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//mendeklarasikan array 2D dengan kolom ganjil
		int arr[][] = new int[4][];
		
		arr[0] = new int[3];
		arr[1] = new int[2];
		arr[2] = new int[9];
		arr[3] = new int[arr.length];
		
		// menginisialisasi array bergerigi
		int count = 0;
		for (int i = 0; i < arr.length; i++) 
			for (int j = 0; j < arr[i].length; j++)
				arr[i][j] = count++;
			
		//mencetak data dari array bergerigi
		for ( int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();//new line
		}
		}
		

	}

