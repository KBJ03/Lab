package Lab2;

import java.util.Scanner;

public class Q3 {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		
		double weight_pound, weight_kilogram;
		final double WEIGHTCONVERTION = 0.454;
		
		System.out.print("Please enter the weight of parcel (in pound): ");
		weight_pound = sc.nextDouble();
		
		weight_kilogram = weight_pound * WEIGHTCONVERTION;
		System.out.print("The weight of parcel in kilogram: " + Math.round(weight_kilogram) + "kg");
		
	}
}