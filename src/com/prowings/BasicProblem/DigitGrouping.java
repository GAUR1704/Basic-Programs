package com.prowings.BasicProblem;

import java.util.Scanner;

public class DigitGrouping {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		
		int input = scan.nextInt();
		
		separateDigits(input);
		
		scan.close();

	}

	private static void separateDigits(int num) {
        System.out.print("Digits between 0-5:");
        while (num > 0) {
            int digit = num % 10;
            if (digit >= 0 && digit <= 5) {
                System.out.print(" " + digit);
            }
            num /= 10;
        }

        System.out.println(); 

        System.out.print("Digits between 6-9:");
        num = num / 10; 
        while (num > 0) {
            int digit = num % 10;
            if (digit >= 6 && digit <= 9) {
                System.out.print(" " + digit);
            }
            num /= 10;
        }

        System.out.println();
	}

}
