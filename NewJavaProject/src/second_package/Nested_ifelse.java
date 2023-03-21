package second_package;
import java.util.Scanner;

public class Nested_ifelse {
	public static void  main (String [] args) {
		int a,b;
		String op;
		System.out.println("Enter the two values a and b");
		Scanner ari = new Scanner(System.in);
		a = ari.nextInt();
		b = ari.nextInt();
		System.out.println("Enter the operation");
		op = ari.nextLine();
		
		if (op.equals "add") {
			System.out.println("Addition of a & b is = "+ a+b);	
		}
		if (op == "subtract") {
			System.out.println("Subtraction of a & b is = "+ (a-b));	
		}
		if (op == "multiply") {
			System.out.println("Multiplication is = "+ a*b);
		}
		if(op == "divide") {
			System.out.println("Division is ="+ a/b);	
		}
		
	}

}
