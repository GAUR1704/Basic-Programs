package com.prowings.BasicProblem;

import java.util.Scanner;

public class SwapTwoNumbersWithoutUsingThirdVeriable {
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the value of x :");
		
		int a = scan.nextInt();
		
		System.out.println("Enter the value of y :");
		
		int b = scan.nextInt();
		
		System.out.println("Before swaping the numbers A = " + a + ", B = " + b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After swaping the numbers A = " + a + ", B = " + b);
		
		
		scan.close();
		

//		int  a = 10;
//		int  b = 20;
//		
//		System.out.println("Before swaping the numbers a = " + a + ", b = " + b);
//		
//		int a = a + b;
//		b = a - b;
//		a = a - b;
//		
//		System.out.println("After swaping the numbers a = " + a + ", b = " + b);


	}

}
