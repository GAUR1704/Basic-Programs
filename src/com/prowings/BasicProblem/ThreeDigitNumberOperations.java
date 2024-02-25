package com.prowings.BasicProblem;

import java.util.Scanner;

public class ThreeDigitNumberOperations {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int input;

		do {

			System.out.println("Enter the three digit number : ");

			input = scan.nextInt();

		}

		while (input < 100 || input > 999);

		displayDigitSeperate(input);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>.");

		int sum = calculateSumOfDigit(input);

		System.out.println("Sum of all digit is : " + sum);

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>.");
		
		displayDigitInReverseOrder(input);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>.");

		displayMaxAndMinDigit(input);
		
		scan.close();

	}

	public static void displayDigitSeperate(int num) {
		int digit;

		digit = num / 100; // Extract hundred digit.

		System.out.println("Hundreds digit " + digit);

		num %= 100;

		digit = num / 10; // Extract ten digit.
		System.out.println("Tens digit " + digit);
		num %= 10;

		digit = num;
		System.out.println("Other numbers " + digit);

	}

	public static int calculateSumOfDigit(int num) {

		int sum = 0;

		while (num > 0) {
			sum = sum + num % 10;

			num = num / 10;
		}

		return sum;
	}

	public static void displayDigitInReverseOrder(int num) {

		while (num > 0) {
			System.out.println(num % 10 + " ");
			num = num / 10;

		}

		System.out.println();

	}

	public static void displayMaxAndMinDigit(int num) {

		int maxDigit = 0;
		int minDigit = 9;

		while (num > 0) {
			int digit = num % 10;
			maxDigit = Math.max(maxDigit, digit);
			minDigit = Math.min(minDigit, digit);
			num /= 10;
		}

		System.out.println("Maximum digit: " + maxDigit);
		System.out.println("Minimum digit: " + minDigit);

	}

}
