package com.prowings.BasicProblem;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the Base of Triangle");

		float base = scan.nextFloat();

		System.out.println("Enter the Height of 90 degree Triangle");

		float height = scan.nextFloat();

		float result = base * height / 2;

		System.out.println("Area of Triangle is :" + result);
		
		scan.close();
	}

}
