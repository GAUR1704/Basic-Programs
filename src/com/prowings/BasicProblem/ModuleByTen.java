package com.prowings.BasicProblem;

import java.util.Scanner;

public class ModuleByTen {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int input = scan.nextInt();
		
		int result = input % 10;
		
		System.out.println("The module of Ten is : " + result);
		
		scan.close();

	}
	
	

}
