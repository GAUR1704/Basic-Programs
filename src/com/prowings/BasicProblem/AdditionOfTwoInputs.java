package com.prowings.BasicProblem;

import java.util.Scanner;

public class AdditionOfTwoInputs {

	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);

		System.out.println("Enter a first number :");

		int num1 = num.nextInt();

		System.out.println("Enter a second number :");

		int num2 = num.nextInt();

		System.out.println("The Addition Of Two Numbers is :" + (num1 + num2));
		
		num.close();

	}

}
