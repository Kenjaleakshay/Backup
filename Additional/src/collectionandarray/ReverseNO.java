package collectionandarray;

import java.util.ArrayList;

public class ReverseNO {
	
	public static void main(String[] args) {
		
		int num = 788;
		int rem;
		int rev = 0;
		while(num!=0) {
			rem = num%10;
			rev = rev*10 + rem;
			num = num/10;
			
		}
		System.out.println(rev);
	
	
	String s = "home ou";
	
	String re = "";
	for(int i=s.length()-1;i>=0;i--) {
		re = re + s.charAt(i);
	}
	
	System.out.println(re);
	
	String vowel = "aeiou";
	
	String q = "ueboemnju";
	
	
		ArrayList<Integer> al = new ArrayList<>();
		int[] ar = {6,5,9,3,9,7,7};
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]==ar[j]) {
					al.add(ar[i]);
				}
				
			
		}
	}
		System.out.println(al);	
	
	
	
			int g = 67;
			char d = (char)g;
			System.out.println(d);
		
		}
		
	}


