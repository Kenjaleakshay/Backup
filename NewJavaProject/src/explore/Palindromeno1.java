package explore;
import java.util.Scanner;

public class Palindromeno1 {
	public static void main(String[] args) {
		int a,b,c,d,e,f,g;
		a=10000000;
		e=1;
	
		System.out.println("Please Enter the no.");
		Scanner t = new Scanner(System.in);
		g = t.nextInt();
		c=g/a;
		while (c==0) {
			a=a/10;
			e=e*10;
			c=g/a;
		}
		System.out.println(e);
		while(g!=0) {
			
		}
			
			
		}
	}


