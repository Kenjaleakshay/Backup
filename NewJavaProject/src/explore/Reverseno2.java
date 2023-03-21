package explore;

public class Reverseno2 {
	public static void main(String[] args) {

		int n = 4455;

		int c =0;
		int j;

		
		while(n!=0) {// true, true, true, false
			j = n%10;// 4 , 5, 2
			c = (c*10) + j;// 0+4=4, 45, 45*10 + 2 = 452
			n = n/10;// 25, 2, 0
		}
		System.out.println(c);
	}

}
