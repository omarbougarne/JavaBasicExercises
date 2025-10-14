package basics;
import java.util.Scanner;

public class SwapVariables {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the first value: ");
	int num1 = input.nextInt();
	
	System.out.println("Enter the first value: ");
	int num2 = input.nextInt();
	System.out.println("The current values are " + num1 + " and " + num2);
	int temp;
	
	temp = num1;
	num1 = num2;
	num2 = temp;
	
	System.out.println("The new values are " + num1 + " and " + num2);
	}
}
