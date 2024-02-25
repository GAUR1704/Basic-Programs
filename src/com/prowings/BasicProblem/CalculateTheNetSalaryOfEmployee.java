package com.prowings.BasicProblem;

import java.util.Scanner;

public class CalculateTheNetSalaryOfEmployee {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the basic salery of Employee");

		float num = scan.nextFloat();

		float result = num + (((num * 45) / 100) + ((num * 25) / 100) + ((num * 30) / 100));
		float res = result - ((result * 0.05f) + (result * 0.25f));

		System.out.println("The final Net Salary of Employee is :" + res);

		scan.close();

	}

}
