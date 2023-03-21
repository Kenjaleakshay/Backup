package Firstpra;

import java.util.Scanner;

public class Advanced_ArmstrongNO {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	
	int temp = num, length = 0;
	
	while(temp!=0) {
		
		temp = temp/10;
		length++;
		}
	int temp2 = num,remainder,result=0;
	
	while(temp2!=0) {
		
		remainder = temp2 %10;
		System.out.println(remainder);
		int newnum = 1;
		for(int i=1;i<=length;i++) {
			
			newnum = newnum*remainder;
			
			}
		
		result = result + newnum;
		temp2 = temp2/10;
		
		}
	if(result==num) {
      System.out.println(num + " is Armstrong no");
	}else {
		System.out.println(num + " is not Armstrong no");
	}
		
		
	}

}
