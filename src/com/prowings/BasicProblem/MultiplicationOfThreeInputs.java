package com.prowings.BasicProblem;

import java.util.Scanner;

public class MultiplicationOfThreeInputs {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a first number :");

		int num1 = scan.nextInt();

		System.out.println("Enter a Second number :");

		int num2 = scan.nextInt();

		System.out.println("Enter a Third number :");

		int num3 = scan.nextInt();

		System.out.println("The Multiplication Of Three Numbers is  :" + (num1 * num2 * num3));

		scan.close();

	}

}
