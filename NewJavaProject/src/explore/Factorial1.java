package explore;
import java.util.Scanner;

public class Factorial1 {
	public static void main(String[] args) {
		int a,b,c,d;
		a=1;
		System.out.println("Enter the no.");
		Scanner j = new Scanner(System.in);
		d=j.nextInt();
		while(d!=1) {
			a=a*d;
			d--;
			}
		System.out.print("Factorial of the given no. is =  "+a);
	}

}
