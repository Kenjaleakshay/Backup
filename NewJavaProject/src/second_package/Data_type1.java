package second_package;

public class Data_type1 {
     public static void main (String [] args ) {
    	Data_type1 var = new Data_type1();
    	var.avg();
     }
     public void avg () {
    	 int x = 10;
    	 int y = 20;
    	 int z = 30;
    	 int avg = (x+y+z)/3;
    	 System.out.println("Average of given No. is " + avg + "\n" + 
    	 "Addition is " + (x+y+z));
     }
}
