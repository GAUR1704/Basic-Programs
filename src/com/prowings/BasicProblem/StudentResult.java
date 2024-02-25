package com.prowings.BasicProblem;

import java.util.Scanner;

public class StudentResult {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the marks of Mathematics");

		int math = scan.nextInt();

		System.out.println("Enter the marks of Science");

		int science = scan.nextInt();

		System.out.println("Enter the marks of Marathi");

		int marathi = scan.nextInt();

		System.out.println("Enter the marks of Hindi");

		int hindi = scan.nextInt();

		System.out.println("Enter the marks of English");

		int english = scan.nextInt();

		System.out.println("Enter the marks of Social Science");

		int social = scan.nextInt();

		int res = (math + science + marathi + hindi + english + social) * 100;

		int result = res / 600;

		if (result >= 35) {
			System.out.println("You are Passed in given exam");

		}

		else
			System.out.println("you are Failed in given exam");
		
		scan.close();

	}

}
