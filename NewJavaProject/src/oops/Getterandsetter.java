package oops;

public class Getterandsetter {
private int a,b;
	public int getval(int a,int b) {
		this.a = a;
		this.b = b;
		int c = a + b;
		return c;
		
	}
	public void noo() {
		int c = a + b ;
		System.out.println(c);
	}
	
	public static void main(String []args) {
		Getterandsetter g = new Getterandsetter();
		
		System.out.println(g.getval(9,6));
		g.noo();
	}
}
