package Firstpra;

import java.util.Scanner;

public class Palindromeseries {
	
	public static void main(String[] args) {
		
Scanner sc  = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		for(int  i= a;i<= b;i++) {
		
			System.out.println(i);
			int temp = i;
			System.out.println(temp);
			int rev = 0;
			int remainder;
			while(temp!=0) {
				
				System.out.println(i);
				 remainder = i%10;
				 rev = rev*10 + remainder;
				 i = i/10;
				
					}
			if(rev==i) {
				System.out.println(rev +" is Palindrome no.");
			}else {
				System.out.println(rev +" is not Palindrome no. ");
			}
			}
		
		
		
		
	}
	
	

}
