package com.prowings.BasicProblem;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter any number to find it's prime number or Not : ");
		
		int number = scan.nextInt();
		
		boolean isPrime = isPrimeNumber(number);
		
		
		if(isPrime) {
			System.out.println(number + " is prime number.");
		}
		else
			System.out.println(number + " is not a prime number.");
		
		scan.close();
	}

	public static boolean isPrimeNumber(int num) {
		
		if (num <= 1) {
			
			return false;
		}
		
		for(int i = 2 ;i<= Math.sqrt(num); i++) {
			
			if(num % i ==0) {
				
				return false;
			}
		}
		
		return true;
	}

}
