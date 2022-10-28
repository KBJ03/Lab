package Lab2;

import java.util.Scanner;

public class Q2 {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		
		double originalPrice, salePrice, percentageDiscount, discount;
		
		System.out.print("Please enter the original price: " + "RM");
		originalPrice = sc.nextDouble();
		
		System.out.print("Please enter the Percentage of discount(%): ");
		percentageDiscount = sc.nextDouble();
		discount = percentageDiscount / 100 ;
		
		salePrice = originalPrice - originalPrice * discount;
		System.out.print("Sale Price: " + "RM" + salePrice);
		
		
	}
}
