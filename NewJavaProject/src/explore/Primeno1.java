package explore;

public class Primeno1 {
	public static void main(String[] args) {
		int a,b,c;
		for(a=2201;a<=2999;a++) {
			for(b=2;b<=a-1;b++) {
				c=a%b;
				if(c==0) {
					System.out.println(a + "is not prime no.");
					break;}
				else if(b==a-1) {
					System.out.println(a + "is Prime no. ");}
					
				}
			}
		}
	}


