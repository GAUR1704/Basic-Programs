package com.prowings.BasicProblem;

import java.util.Scanner;

public class GreaterAndSmallerNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first number : ");
		
		int input1 = scan.nextInt();
		
		System.out.println("Enter the second number : ");
		
		int input2 = scan.nextInt();
		
		System.out.println("You have entered first number as :" + input1 + " and second number is :" + input2);
		
		if (input1>input2) {
			
			System.out.println("So first entered number is greater than second number");
		}
		else
			System.out.println("So second entered number is greater than first number");
		
		scan.close();

	}

}
