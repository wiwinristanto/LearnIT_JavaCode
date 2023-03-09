package com.learnIT.method.hw;

import java.util.Iterator;

public class GenerateMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [][] myarray = new double[8][8];
		
		for(int i = 0; i < 8; i++) {
			for (int j = 0; j< 8; j++) {
				myarray[i][j] = i + j;
			}
		}
		
		
		
		for (int i = 0; i < 8/2; i++) {
			for(int j = 0; j < 8/2; j++) {
//				System.out.print("j=" + j);
//				System.out.print(" i=" + i);				
				System.out.print(myarray [i][j]+ ", ");
			}
			System.out.println();
		}
		
		System.out.println("program test");
		for (int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				System.out.print("j=" + j);
				System.out.print(" i=" + i);				
				System.out.print(myarray [i][j]+ ", ");
			}
			System.out.println();
		}
		
	}
}
