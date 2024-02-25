package com.prowings.BasicProblem;

import java.util.Scanner;

public class CalculateTotalAndAverageOfFiveSubject {

static	Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
			System.out.println("Enter a marks of Mathematics :");
			
			int num1 = scan.nextInt();
			
			System.out.println("Enter a marks of English :");
			
			int num2 = scan.nextInt();
			
			System.out.println("Enter a marks of Marathi :");
			
			int num3 = scan.nextInt();
			
			System.out.println("Enter a marks of Science :");
			
			int num4 = scan.nextInt();
			
			System.out.println("Enter a marks of Hindi :");
			
			int num5 = scan.nextInt();
			
			int result = num1+num2+num3+num4+num5;
			
			System.out.println("The total marks of five subjects is :"+ result);
			
			int result1 = result/5;
			System.out.println("The Average of five subjects is :"+ result1);
		}
		
		

	

}
