package justexplore;

import java.util.Scanner;

public class Largestno {
	
	public static void main(String[] args() {
		
		Scanner d = new Scanner(System.in);
		int a,b,c;
		a = d.nextInt();
		b = d.nextInt();
		c = d.nextInt();
		if(a>b) {
			if(a>c) {
				System.out.println("A is gratest");
			}else {
				System.out.println("C is gratest");
			}}
		if(b>a) {
			if(b>c) {
				System.out.println("B is gratest");
			}else {
				System.out.println("C is gratest");
			}}
		
			
	}

}
