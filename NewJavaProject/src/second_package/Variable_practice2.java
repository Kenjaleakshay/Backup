package second_package;

public class Variable_practice2 {
      int x;
      String d;
      int y;
      public static void main(String [] args) {
    	Variable_practice2 sc = new Variable_practice2();
    	sc.ns1();
    	sc.ns2();
    	}
      public void ns1() {
    	  x = 3838;
    	  y = 7373;
    	  int z = x+y;
    	  System.out.println(z);
      }
      public void ns2() {
    	  x = 545;
    	  y = 545;
    	  d = "this is multiplication ";
    	  int z = x*y;
    	  System.out.println(d + z);
      }
}
