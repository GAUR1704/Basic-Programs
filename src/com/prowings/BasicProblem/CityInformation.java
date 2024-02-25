package com.prowings.BasicProblem;

import java.util.Scanner;

public class CityInformation {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Select the city from below list : ");
		System.out.println("1. Pune");
		System.out.println("2. Mumbai");
		System.out.println("3. Nagpur");
		System.out.println("4. Banglore");

		System.out.println("Enter the city number(1-4): ");

		int information = scan.nextInt();

		switch (information) {

		case 1:
			displayPuneInformation();

			break;

		case 2:

			displayMumbaiInformation();

			break;

		case 3:

			displayNagpurInformation();

			break;

		case 4:

			displayBangloreInformation();

			break;

		default:
			System.out.println("Invalid city number. Please enter a number between 1 and 4.");

		}

		scan.close();

	}

	private static void displayPuneInformation() {

		System.out.println("Pune city information");
		System.out.println("Pune is metro city");
		System.out.println("Pune has second biggest IT hub");
		System.out.println("Pune is located in Maharastra");

	}

	private static void displayMumbaiInformation() {

		System.out.println("Mumbai city information");
		System.out.println("Mumbai is metro city and also have good local train connectivity");
		System.out.println("Mumbai is best for the Tourism");
		System.out.println("Mumbai is capity of Maharastra");

	}

	private static void displayNagpurInformation() {

		System.out.println("Nagpur city information");
		System.out.println("Nagpur is metro city");
		System.out.println("Nagpur is also knows as Orenge city");
		System.out.println("Nagpur is located in Maharastra");

	}

	private static void displayBangloreInformation() {

		System.out.println("Banglore city information");
		System.out.println("Banglore is metro city");
		System.out.println("Banglore is a biggest IT park");
		System.out.println("Banglore is located in Karnataka");

	}

}
