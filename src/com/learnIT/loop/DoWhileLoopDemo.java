package com.learnIT.loop;

public class DoWhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("====== do-while loop");
		int counter = 0;
		do {
			System.out.println("counter: "+ counter++);
		}while (counter <5 );
		do {
			System.out.println("counter is five already: "+ counter);
		}while(counter <5);

	}

}
