package oops;

public class Execute_Interface implements Interface1,Interface2 {
public void ad() {
	System.out.println(a+b);
}
public void sub() {
	System.out.println(a-b);
}
public void mult() {
	System.out.println(a*b);
}
public void div() {
	System.out.println(a/b);
}
public void nst1() {
	System.out.println("This is nonnnn met from class");
}
public static void main(String[] args) {
	Execute_Interface k = new Execute_Interface();
	k.ad();
	k.sub();
	k.mult();
	k.div();
	Interface1.st1();
	k.nst1();
}
}