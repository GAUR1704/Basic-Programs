package com.prowings.BasicProblem;

import java.util.Scanner;

public class FindLeapYearOrNot {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter any calender year to find its Leap or Not : ");
		
		int input = scan.nextInt();
		
		if((input % 4 == 0) && ((input % 100 != 0) || (input % 400 == 0))) {
			
			System.out.println(input + " is Leap Year");
		}
		else
			System.out.println(input + " is not a leap year");
		
		scan.close();
		

	}

}
