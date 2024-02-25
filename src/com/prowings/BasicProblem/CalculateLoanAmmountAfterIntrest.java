package com.prowings.BasicProblem;

import java.util.Scanner;

public class CalculateLoanAmmountAfterIntrest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Loan Ammount :");
		
		float num = scan.nextFloat();
		
		float result = ((num*12)/100)+num;
		
		System.out.println("The Final ammount of Loan after addition of intrest"+ result);
		
		
		scan.close();

	}

}
