package com.prowings.BasicProblem;

import java.util.Scanner;

public class AreaOfTwoSidesOfRectangle {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the First Side Value oF Rectangle :");

		float Side1 = scan.nextFloat();

		System.out.println("Enter the Second Side Value oF Rectangle :");

		float Side2 = scan.nextFloat();

		float result = Side1 * Side2;

		System.out.println("The area of two sides of rectangle :" + result);

		scan.close();

	}

}
