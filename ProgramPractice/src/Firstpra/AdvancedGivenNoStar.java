package Firstpra;

import java.util.Scanner;

public class AdvancedGivenNoStar {
	
public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int totrows = (2*num)-1;
	    int d;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num-i;j++) {
				System.out.print(" ");
			
			}
			 d=0;
			for(int k=1;k<=i+(i-1);k++) {
				if(k<=i) {	
					d++;
				}else {
					d--;
				}
				System.out.print(d);
				}
			System.out.println();
			}
	int e;
		for(int a=1;a<=num-1;a++) {
			for(int b=1;b<=a;b++) {
				System.out.print(" ");
			}
			e=0;
			for(int c=1;c<=((2*num)-1)-(2*a);c++) {
				if(c<=num-a) {
					e++;
				}else {
					e--;
				}
				System.out.print(e);
				}
			System.out.println();
		}
		
		}
	


}
