package com.prowings.BasicProblem;

import java.util.Scanner;

public class CalculateVolumeOfBox {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a Length of Box");

		int Length = scan.nextInt();

		System.out.println("Enter a Breadth of Box");

		int Breadth = scan.nextInt();

		System.out.println("Enter a Height of Box");

		int Height = scan.nextInt();

		int result = Length * Breadth * Height;

		System.out.println("THe Volume of a box is :" + result);

		scan.close();

	}

}
