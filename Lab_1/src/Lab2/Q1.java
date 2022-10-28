package Lab2;

import java.util.Scanner;

public class Q1 {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int num1,num2,num3;
		int sum = 0;
		int average = 0;
		
		System.out.print("First Number: ");
		num1 = sc.nextInt();
		
		System.out.print("Second Number: ");
		num2 = sc.nextInt();
		
		System.out.print("Third Number: ");
		num3 = sc.nextInt();
		
		sum = num1 + num2 + num3;
		average = sum / 3;
		
		System.out.print("Average of Three numbers: " + average);
		
	}
}
