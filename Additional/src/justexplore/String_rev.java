package justexplore;

public class String_rev {
	
	public static void main(String[] args) {
		
		String s1 = "Developer";
	
		String rev = "";
		for(int i=s1.length();i<=1;i--) {
			char l = s1.charAt(i);
			rev = rev + l;
			
		}
		System.out.println(rev);
		
	}

}
