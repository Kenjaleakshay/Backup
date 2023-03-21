package Firstpra;

import java.util.Scanner;

public class ArmstrongSeries {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int startnum = sc.nextInt(),endNum = sc.nextInt();
		
		for(int i = startnum;i<=endNum;i++) {
			
			int length = 0;
			int temp = i;
			while(temp!=0) {
				
				length++;
				temp = temp/10;
				}
			int temp2 = i,remainder,result =0;
			
			while(temp2!=0) {
				
				remainder = temp2 %10;
				int nthpower = 1;
					
			for(int j = 1;j<=length;j++) {
				
				nthpower = nthpower*remainder;
				}
			System.out.println("nthpower for digit is " +nthpower);
			result = result + nthpower;
			System.out.println("result is " +result);
			temp2 = temp2/10;
			}
			if(result==i) {
				System.out.println(i + " is Armstrong no");
			}else {
				System.out.println(i + " is not Armstrong no");
			}
		
		
	}

}
}