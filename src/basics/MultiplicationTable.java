package basics;
import java.util.Scanner;
public class MultiplicationTable {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter the desired number multiplication table: ");
	    int num = input.nextInt();
	    
	    for(int i = 1; i <= 10; i++) {
	    	int result = num * i;
	    	System.out.println(num + " * " + i + " = " + result);
	    }
	  }
}
