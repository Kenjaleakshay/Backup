package justexplore;

public class Player {
	
	public static void main(String[] args) {
		
		Game j = new Game();
		Weapon l = j.pressbutton();
		System.out.println(l);
		l.use();
		
	}

}
