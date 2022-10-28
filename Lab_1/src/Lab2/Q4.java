package Lab2;

import java.util.Scanner;

public class Q4 {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		
		double weight, height, BMI;
		
		System.out.print("Weight(kg): ");
		weight = sc.nextDouble();
		
		System.out.print("Height(m): ");
		height = sc.nextDouble();
		
		BMI = weight / (Math.pow(height, 2));
		
		System.out.print("BMI: " + BMI);
		
	}
}
