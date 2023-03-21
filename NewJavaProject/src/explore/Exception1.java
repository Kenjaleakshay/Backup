package explore;

public class Exception1 {

	public  void vi() {
		int [] ar = new int[3];
		ar[0] = 4;
		ar[1] = 4;
	    ar[4] = 4;
		
		//System.out.println("Main method without static");
	}
	public static void main(String[] args) {
	Exception1 f = new Exception1();
	f.vi();
	}
}
