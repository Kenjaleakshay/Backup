package explore;
import java.util.Scanner;

public class Fibonacciseries1 {
public static void main(String[] args) {
	int a,b,c,d,n,e;
	int count;
	a=0;
	b=1;
	c=a+b;
	count = 3;
System.out.println("Enter the n th no.");
Scanner g = new Scanner(System.in);
n=g.nextInt();
while(n!=count) {
	
	a=b;
	b=c;
	c=a+b;
	//e=a+b;
	count++;
	}
System.out.print(c);
g.close();
	
}
}
