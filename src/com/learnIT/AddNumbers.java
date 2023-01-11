package com.learnIT;

import java.util.Scanner;

public class AddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p = Integer.parseInt(args[1]);
		Scanner sc = new Scanner(System.in);
		float i = sc.nextFloat();
		float j = sc.nextFloat();
		System.out.println(i+j+args[0]);
	}

}
