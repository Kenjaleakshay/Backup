package second_package;

public class Variable_practice {
	int x = 1000;
	int y = 2000;
	static float a = 99.75f;
	static float b = 95.55f;

	public static void main (String [] args) {
		boolean m = 2>5;
		short n = 32765;
		float add = a+b;
		System.out.println(m + "\n" + n + "\n" + 
		"Addition is " + add);
		s1();
		Variable_practice h = new Variable_practice ();
		h.ns1();
		}
	public static void s1() {
		float div = (a/b);
		System.out.println("Div. is " + div);
		}
	public void ns1() {
		int d = (x+y);
		float avg = (a+b)/2;
		System.out.println("Value of (a+b) is " + d + "\n" + 
		"Avg2 is " + avg);
		
	}
}
