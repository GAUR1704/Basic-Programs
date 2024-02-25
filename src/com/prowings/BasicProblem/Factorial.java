package com.prowings.BasicProblem;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number : ");

		int number = scan.nextInt();

		int result = 1;
		for (int i = 1; i <= number; i++) {
			result *= i;
		}
		
		System.out.println("The factorial of given number is : " + result);

		scan.close();
	}
	
}
