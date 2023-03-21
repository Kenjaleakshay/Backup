package Firstpra;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		int a=0,b=1;
		int initial = 2,c = 0;
		Scanner sc  = new Scanner(System.in);
		
		int count  = sc.nextInt();
		while(count != initial) {
		
			 c = a + b;
			a = b;
			b = c;
			initial++;
			System.out.println(c);
			}
		
		
		
		
		
		
		
	}

}
