package explore;

public class Reverseno1 {
	public static void main(String[] args) {
		int a,n;
		n=5600;
	//	a=2^10;
	//	System.out.print(a);
		
		
		while(n!=0) {
			a=n%10;
			System.out.print(a);
			n=n/10;
		}
	}

}
