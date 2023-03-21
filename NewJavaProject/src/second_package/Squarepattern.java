package second_package;

public class Squarepattern {
public void m1() {
	int i,j;
	for(i=1;i<=4;i++) {
		for(j=1;j<=4;j++) {
			System.out.print("* ");}
		System.out.println();
		}
	}
public void m2() {
	int a,b,c;
	for(a=1;a<=4;a++) {
		System.out.print("* ");}
	System.out.println();
	for(b=1;b<=2;b++) {
		System.out.print("* ");
		for(c=1;c<=3;c++) {
			System.out.print(" ");}
		System.out.println(" *");}
			
		}
		
	



public static void main(String[] args) {
	Squarepattern g= new Squarepattern();
	
	g.m2();
}
}