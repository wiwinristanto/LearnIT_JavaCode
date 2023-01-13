package com.learnIT.loop;

import java.util.Iterator;

public class NestedLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("====== nested loop");
		for (int i=0; i<5; i++) {
			System.out.println("*** i = "+i+" ***");
			for(int j=0; j<3; j++) {
				System.out.println(j+"\t");
			}
			System.out.println();
		}

	}

}
