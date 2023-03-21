package Firstpra;

public class Advancedstar {
	
	public static void main(String[] args) {
		
	
		
		int d;
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3-i;j++) {
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
		for(int a=1;a<=3;a++) {
			for(int b=1;b<=a;b++) {
				System.out.print(" ");
			}
			e=0;
			for(int c=1;c<=5-(2*a);c++) {
				if(c<=2) {
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
