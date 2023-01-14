package com.learnIT.loop;

import java.util.Iterator;
import java.util.Scanner;

public class PyramidInConsoleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int pyramid = sc.nextInt();
		int pyramid = 4;
		int st = 1;
		
		for(int i = 1; i <= 2*pyramid; i++) {
			for (int j = 1; j<= st; j++) {
				System.out.print("*");
			}
			if(i<(2*pyramid)/2) {
				st++;
			}else {
				st--;
			}
			System.out.println("");
		}
//		sc.close();
		
	}

}
