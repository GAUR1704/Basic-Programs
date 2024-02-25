package com.prowings.BasicProblem;

import java.util.Scanner;

public class OddOrEvenNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number : ");

		int input = scan.nextInt();

		if (input % 2 == 0) {
			
			System.out.println("The given number is Even");

		}
		else
			System.out.println("The given number is Odd");
		
		scan.close();

	}

}
