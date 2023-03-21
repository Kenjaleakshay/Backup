package Firstpra;

import java.util.Scanner;

public class Palindomeno {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(),a,newnum = 0,remainder;
		a = num;
		
		 
		while(num!=0) {
			
			remainder = num%10;
			newnum = newnum*10 + remainder;
			num = num/10;
			
			}
		if(newnum == a) {
			System.out.println(a +" is Palindrome no");
		}else {
			System.out.println(a +" is not Palindrome no");
		}
		sc.close();
		
	}

}
