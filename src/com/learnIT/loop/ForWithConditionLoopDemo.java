package com.learnIT.loop;

public class ForWithConditionLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("======= for loop");
		int i= 0;
		for (; i <5 ;) {
			System.out.println("counter: "+i);
			i++;
		}
		//infiniti loop
//		for(;;) {
//			
//		}
		System.out.println("===== for loop | comma usage example");
		for(int k = 0, j = 10; k<j; k++, j--) {
			System.out.println("counter: k = "+k+",j = " +j);
		}

	}
}
