package com.prowings.BasicProblem;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the first number : ");

		int a = scan.nextInt();

		System.out.println("Enter the first number : ");

		int b = scan.nextInt();

		System.out.println("Enter the operation (+, -, *, /): ");

		char operation = scan.next().charAt(0);

		double result;

		switch (operation) {
		case '+':
			result = a + b;

			System.out.println("Result: " + result);

			break;

		case '-':
			result = a - b;
			System.out.println("Result: " + result);

			break;

		case '*':
			result = a * b;
			System.out.println("Result: " + result);

			break;

		case '/':
			if (b != 0) {
				result = a / b;
				System.out.println("Result: " + result);

			} else {
				System.out.println("Error: Division by zero is not allowed.");
			}
			break;

		default:
			System.out.println("Error: Invalid operation");
			
			scan.close();
		}

	}

}
