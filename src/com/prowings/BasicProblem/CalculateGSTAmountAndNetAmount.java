package com.prowings.BasicProblem;

import java.util.Scanner;

public class CalculateGSTAmountAndNetAmount {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Bill Ammount of Customer Product ");
		
		float num = scan.nextFloat();
		
		float result = ((num*18)/100)+num;
		
		System.out.println("The Final Ammount of Customer Product is :"+ result);
		
		scan.close();
	}

}
