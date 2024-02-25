package com.prowings.BasicProblem;

import java.util.Scanner;

public class MathExpression2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the value of a : ");
		
		int a = scan.nextInt();
		
		System.out.println("Enter the value of b : ");
		
		int b = scan.nextInt();
		
		
		double result = Math.pow(a, b);
		
		
		System.out.println("The result is : " + result);
		
		scan.close();

	}

}
