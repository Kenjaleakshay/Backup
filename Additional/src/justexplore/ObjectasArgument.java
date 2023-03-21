package justexplore;

public class ObjectasArgument {

	String name;
	String lname;
	
	public ObjectasArgument(String fna,String lna) {
		
		name = fna;
		lname = lna;
		
	}
	public void info(ObjectasArgument d) {
		
		System.out.println("First name is "+name);
		System.out.println("Last name is "+lname);
	}
	
}
