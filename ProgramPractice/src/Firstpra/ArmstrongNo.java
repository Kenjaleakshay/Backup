package Firstpra;

import java.util.Scanner;

public class ArmstrongNo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(),newnum = 0,remainder;
		int temp = num;
		while(num!=0) {
			
			remainder = num%10;
			newnum = newnum + remainder*remainder*remainder;
			num = num/10;
			
			}
		if(newnum==temp) {
			System.out.println(temp + " is Armstrong no");
		}else {
			System.out.println(temp + " is not Armstrong no");
		}
		
		
		
	}

}
