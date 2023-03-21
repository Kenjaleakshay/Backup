package second_package;

public class Execution_class {
	public static void main(String [] args) {
		Logic_odd_even eo = new Logic_odd_even();
		eo.odd_even();
		Showroom v = new Showroom();
		v.budg("Bike",50000);
		Shopping_bill g = new Shopping_bill();
	g.soap(1);
	g.sugar(2);
	g.tot();
	}

}
