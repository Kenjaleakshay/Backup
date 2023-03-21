package explore;

public class Diff_triangle {
	public static void main(String[] args) {
		int a,b,c;
		for(a=1;a<=5;a++) {
			for(b=a;b<=9-a;b++) {
				System.out.print(" ");}
			for(c=1;c<=1+(2*(a-1));c++) {
				System.out.print("* ");}
			System.out.println();
			}
		}
	}


