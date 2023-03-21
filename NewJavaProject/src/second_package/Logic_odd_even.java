package second_package;

public class Logic_odd_even {

	public void odd_even() {
		int a = -23;
		if ( (a < 0 && a%2 == 0) |(a > 0 && a%2 == 0 )) {
			System.out.println("A is an even no." );
		}else if (a == 0) {
			System.out.println("Please enter the value other than zero");
		}else {
			System.out.println("A  is an odd no.");
		}
	}
	}

