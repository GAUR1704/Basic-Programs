package com.prowings.BasicProblem;

import java.util.Scanner;

public class SmallerNumberInFourInput {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the first number : ");

		int input1 = scan.nextInt();

		System.out.println("Enter the second number : ");

		int input2 = scan.nextInt();

		System.out.println("Enter the third number : ");

		int input3 = scan.nextInt();

		System.out.println("Enter the fourth number : ");

		int input4 = scan.nextInt();
		
		int result;

		if (input2 > input1 && input3 > input1 && input4 > input1) {
			
			result = input1;
		}
		else if(input1 > input2 && input3 > input2 && input4 > input2) {
			
			result = input2;
		}
		else if(input2 > input3 && input1 > input3 && input4 > input3) {
			
			result = input3;
		}
		else
			result = input4;
		
		System.out.println("The Smaller number is : " + result);
		
		scan.close();
			

	}

}
