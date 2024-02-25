package com.prowings.BasicProblem;

import java.util.Scanner;

public class AreaAndCircumferenceOfCircle {

	static float PI = 3.14f;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a Redius of circle :");

		float redius = scan.nextFloat();

		float Area = PI * redius * redius;
		float Circumference = 2 * PI * redius;

		System.out.println("The Area Of Circle is :" + Area);

		System.out.println("The Circumference Of Circle is :" + Circumference);

		scan.close();

	}

}
