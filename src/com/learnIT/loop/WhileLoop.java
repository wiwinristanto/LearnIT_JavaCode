package com.learnIT.loop;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		boolean kondisi = true;
		
		System.out.println("Awal Program");
		
		while (kondisi) {
			System.out.println("While loop ke - : "+a);
			if(a == 10) { 
				kondisi = false;
			}
			a++;
		}
		System.out.println("Akhir program");
	}

}
