package basics;

import java.util.Scanner;

public class ProductOfTwoNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter The First Number:");
		int num1 = input.nextInt();
		System.out.println("Please Enter The Second Number:");
		int num2 = input.nextInt();
		
		int prod = num1 * num2;
		
		
		System.out.println();
		System.out.println("The sum of the numbers is: " + prod);
		
		input.close();
	}
}



