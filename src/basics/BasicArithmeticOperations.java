package basics;
import java.util.Scanner;

public class BasicArithmeticOperations {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("Please Enter The First Number:");
			int num1 = input.nextInt();
			System.out.println("Please Enter The Second Number:");
			int num2 = input.nextInt();
			
			int sum = num1 + num2;
			int sub = num1 - num2;
			int multi = num1 * num2;
			int div = num1 / num2;
			int mod = num1 % num2;
			
			
			System.out.println();
			System.out.println("The sum of the numbers is: " + sum + "\nThe subtraction of the numbers is: " + sub + "n\nhe multiplicity of the numbers is: " + multi + "\nThe devision of the numbers is: " + div + "n\nhe rest of the numbers is: " + mod);
			
			input.close();
		}
}
