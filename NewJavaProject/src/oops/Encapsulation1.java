package oops;

public class Encapsulation1 {

	private String name;
	
	public String getname() {
		//String name = this.name;
		return name;
		
	}
	public void setname(String name) {
		this.name = name;
		
	}

public static void main(String []args) {
	
	Encapsulation1 f = new Encapsulation1();
	f.setname("uiddf");
	String newly = f.getname();
 	System.out.println(newly);
}
}