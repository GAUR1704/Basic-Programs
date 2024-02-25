package com.prowings.BasicProblem;

import java.util.Scanner;

public class ListOfBikeModel {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the model information");

		System.out.println("1. KTM RC");
		System.out.println("2. Honda Shine");
		System.out.println("3. Yamaha MT15");
		System.out.println("4. TVS Apache");

		System.out.println("Enter the model number (1-4):");

		int modelNumber = scan.nextInt();

		switch (modelNumber) {

		case 1:
			displayFirstModelInformation();

			break;

		case 2:
			displaySecondModelInformation();

			break;

		case 3:
			displayThirdModelInformation();

			break;

		case 4:

			displayFourthModelInformation();

			break;

		default:
			System.out.println("Invalid model number. Please enter a number between 1 and 4.");
		}

		scan.close();

	}

	public static void displayFirstModelInformation() {

		System.out.println("First Model(KTM RC) Information:");
		System.out.println("Engine: 200cc");
		System.out.println("Mileage: 30 km/l");
		System.out.println("Top Speed: 200 km/h");

	}

	public static void displaySecondModelInformation() {

		System.out.println("Second Model(Honda Shine) Information:");
		System.out.println("Engine: 120cc");
		System.out.println("Mileage: 50 km/l");
		System.out.println("Top Speed: 120 km/h");

	}

	public static void displayThirdModelInformation() {

		System.out.println("Third Model(Yamaha MT15) Information:");
		System.out.println("Engine: 180cc");
		System.out.println("Mileage: 40 km/l");
		System.out.println("Top Speed: 200 km/h");

	}

	public static void displayFourthModelInformation() {

		System.out.println("Fourth Model(TVS Apache) Information:");
		System.out.println("Engine: 125cc");
		System.out.println("Mileage: 45 km/l");
		System.out.println("Top Speed: 160 km/h");

	}

}
