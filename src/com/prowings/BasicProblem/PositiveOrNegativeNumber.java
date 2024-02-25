package com.prowings.BasicProblem;

import java.util.Scanner;

public class PositiveOrNegativeNumber {
	
	

	public static void main(String[] args) {
		
		int input = 0;
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter the number : ");
		
		input = scan.nextInt();
		
		if(input > 0) {
		
		System.out.println(input + " is Positive");
		
		}
		
		else
			if(input<0){
			
			System.out.println(input + " is Negative");
			
			}
			else
				System.out.println("Number is Zero");
		
		scan.close();
			
			
		}

	}


