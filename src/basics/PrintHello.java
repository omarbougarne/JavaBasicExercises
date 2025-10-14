package basics;
import java.util.Scanner;


public class PrintHello {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please Enter You First Name:");
	String fname = input.next();
	System.out.println("Please Enter You Last Name:");
	String lname = input.next();
	System.out.println("Your Name is\n" + fname + " " + lname + " :)");
	}
}
