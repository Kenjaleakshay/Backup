package second_package;

public class Non_static_method {
	public static void main (String [] args) {
		Non_static_method m = new Non_static_method();
		m.mock();
		group();
		m.meet();
	}
	public static void group() {
		System.out.println("Group is B");
	}
	public void mock() {
		System.out.println("this is our 11 th mock");
	}
	public void meet() {
		System.out.println("this is 3 rd meet ");
	}
}

