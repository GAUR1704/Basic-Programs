package com.prowings.BasicProblem;

import java.util.Scanner;

public class PossitiveAndNegativeNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[]num = new int[10];
		
		System.out.println("Enter the 10 interger numbers :");
		
		for(int i = 0 ; i < 10 ; i++) {
			
			System.out.println("Enter the number "+ (i+1)+ ":");
			
			num[i] = scan.nextInt();
		}
		
		System.out.println("The possitive numbers is : ");
		
		for(int value : num) {
			
			if(value > 0) {
				System.out.println(value + " ");
				
			}
		}
		
		System.out.println("The negative numbers is : " );
		for (int value : num ) {
			
			if (value < 0 ) {
				System.out.println(value + " ");
			}
		}
		
		scan.close();
	}

}
