package com.prowings.BasicProblem;

import java.util.Scanner;

public class HireADriver {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the Age of candidate : ");

		int input1 = scan.nextInt();

		System.out.println("Enter driving experience of candidate in year : ");

		int input2 = scan.nextInt();

		System.out.println("Enter the 12th Marks of candidate : ");

		int input3 = scan.nextInt();

		if (input1 >= 40 && input2 >= 10 && input3 >= 60) {

			System.out.println("Age of candidate is " + input1);
			System.out.println("Driving experience of candidate is " + input2 + "years");
			System.out.println("12th Marks of candidate is " + input3 + "%");
			System.out.println("This candidate is eligible for job. he has passed all three criteria’s ");

		} else
			System.out.println("This candidate id not eligible for job");

		scan.close();

	}

}
