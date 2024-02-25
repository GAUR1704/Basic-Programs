package com.prowings.BasicProblem;

import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the first number :");
		int firstNumber = scan.nextInt();

		System.out.println("Enter the Second number :");
		int secondNumber = scan.nextInt();

		System.out.println("Before Swaping !!");
		
		System.out.println("First Number is " + firstNumber);
		
		System.out.println("First Number is " + secondNumber);

		int num = firstNumber;

		firstNumber = secondNumber;

		secondNumber = num;

		System.out.println("After Swaping");

		System.out.println("First Number is :" + firstNumber);
		
		System.out.println("First Number is :" + secondNumber);
		
		scan.close();
	}

}




















