package second_package;
import java.util.Scanner;
public class Forloop {
	public static void main(String [] args ) {
		Scanner z= new Scanner (System.in);
		int a,b,c;
		System.out.println("Enter the smaller no. first");
		b = z.nextInt();
		System.out.println("Enter the larger no. ");
	
		
		c= z.nextInt();
		for(a = b;a <=c ;a++) {
			if (a%2 == 0) {
				System.out.println(a + " is even no ");}
				else {
					System.out.println(a + " is odd no");
				}
				
			}
		}
	}


