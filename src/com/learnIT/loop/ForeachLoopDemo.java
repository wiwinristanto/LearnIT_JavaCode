package com.learnIT.loop;

public class ForeachLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3};
		int sum = 0 ;
		for (int number :arr) {
			sum += number;
			System.out.println("Number: "+number);
		}
		System.out.println("Sum: "+sum);
		
	}

}
