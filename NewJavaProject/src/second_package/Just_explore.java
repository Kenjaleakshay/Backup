package second_package;

public class Just_explore {
	public static void mwarg(int a,int b) {
		System.out.println("The value of integer a is " + a);
		System.out.println("The value of integer b is " + b);
	
	}
public static void main(String [] args) {
	mwarg(10,20);
	mwarg(45);
	Constructor1 n = new Constructor1("2 kg","3 kg","4 kg",
			"2 kg","2 kg","6 nos.","3 boxes","10 kg","8 kg");
	n.list();
	Non_static_method d = new Non_static_method();
	d.mock();
	Non_static_method.group();
}
public static void mwarg(int a) {
    System.out.println("the val. of a is " + a);
   	
}
}
