package com.prowings.BasicProblem;

public class CalculateFactorial {

	public static void main(String[] args) {
		int number = 5;
		int factorial = 1;

		for (int i = 1; i <= number; i++) {
			factorial *= i;

		}
		System.out.println("The factorial of given number is : " + factorial);

	}

}
