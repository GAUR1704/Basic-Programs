package com.prowings.BasicProblem;

import java.util.Scanner;

public class DigitCounter {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number : ");

		long input = scan.nextInt();

		int digitCount = countDigits(input);

		System.out.println("Total digit of number is : " + digitCount);

		scan.close();

	}

	public static int countDigits(long num) {

		int count = 0;

		if (num < 0) {
			num = -num;
			
		}

		while (num > 0) {
			num = num / 10;
			count++;
		}

		return count;
	}

}
