package second_package;

public class Constructor1 {
    String ent1;
    String ent2;
    String ent3;
    String ent4;
    String ent5;
    String ent6;
    String ent7;
    String ent8;
    String ent9;
    
    Constructor1(String sugar, String rice, String Wheat, String Bajra,
    	String Maida, String Soap, String Biscuit,String Oil,String Onion){
    	ent1=sugar;
    	ent2=rice;
    	ent3=Wheat;
    	ent4=Bajra;
    	ent5=Maida;
    	ent6=Soap;
    	ent7=Biscuit;
    	ent8=Oil;
    	ent9=Onion;
    }
    public static void main(String [] args) {
    	Constructor1 cust1 = new Constructor1("2 kg","3 kg","4 kg",
    			"2 kg","2 kg","6 nos.","3 boxes","10 kg","8 kg");
    	cust1.list();
    	
    }
    public void list() {
    	System.out.println("         Commodity Name       " + "      Qty      ");
    	System.out.println("            1.Sugar                 " + ent1);
    	System.out.println("            2.Rice                  " + ent2);
    	System.out.println("            3.Wheat                 " + ent3);
    	System.out.println("            4.Bajra                 " + ent4);
    	System.out.println("            5.Maida                 " + ent5);
    	System.out.println("            6.Soap                  " + ent6);
    	System.out.println("            7.Biscuit               " + ent7);
    	System.out.println("            8.Oil                   " + ent8);
    	System.out.println("            9.Onion                 " + ent9);
    	
    }
 
}
