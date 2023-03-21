package explore;

public class Palindromeno2 {
	
	public static void main(String[] args) {
		
		int a = 121;
		int b,c,d,e;
		b=a;
		d=0;
		while(a!=0) {
			c=a%10;
			d=d*10+c;
			a=a/10;
		}
		System.out.println(d);
		if(d==b) {
			System.out.println(b + " is Palindrome no.");}
		else {
			System.out.println(b + " is not Palindrome no.");}
		}
		
	}


