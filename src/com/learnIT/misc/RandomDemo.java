package com.learnIT.misc;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		System.out.println(random.nextInt()); 			//any rando int
		System.out.println(random.nextInt(100));		//any int from 0 to 99
		System.out.println(random.nextInt(100) + 1 );	//any int 1 to 100
	}

}
