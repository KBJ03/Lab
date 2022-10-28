package Lab2;

import java.util.Scanner;

public class Q5 {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in)
				;
		int number, digit_1, digit_2, digit_3, multipication;
		
		System.out.print("Enter a number between 0 and 1000: ");
		number = sc.nextInt();
		
		digit_1 = number % 10;
		digit_2 = number / 10 % 10;
		digit_3 = number / 100;
		
		multipication = digit_1 * digit_2 * digit_3 ;
		
		System.out.println("The multipication of all digits in " + number + " is " + multipication);
		
	}
}
