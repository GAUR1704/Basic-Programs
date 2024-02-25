package com.prowings.BasicProblem;

import java.util.Scanner;

public class LargerNumberInThreeInput {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the first number : ");

		int input1 = scan.nextInt();

		System.out.println("Enter the second number : ");

		int input2 = scan.nextInt();

		System.out.println("Enter the third number : ");

		int input3 = scan.nextInt();

		int result;

		if (input1 >= input2 && input1 >= input3) {
			result = input1;

		}

		else if (input2 >= input1 && input2 >= input3) {
			result = input2;
		}
		
		else
			result = input3;

		System.out.println("The largest number is: " + result);

		scan.close();

	}

}
