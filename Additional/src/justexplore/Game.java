package justexplore;

public class Game {

	
	Weapon clickbutton() {
		
		int score = 400;
		if(score <= 300) {
			Knife k = new Knife();
			return k;}
		else if(score > 300 && score <= 500) {
			Gun g = new Gun();
			return g;}
		else if(score > 500) {
			Bomb b = new Bomb();
			return b;}
		
			
		}
	}

