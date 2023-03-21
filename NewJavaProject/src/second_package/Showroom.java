package second_package;

public class Showroom {
public  void budg(String veh , int budget) {
		
		// 1) Switch Statement 
		// Test Value 
		// Code to be executed
		// Equality test value = test value
		// Multiple condition with some test value 
		// 1 2 3 4 5 - 4
		
		
	//String veh  ;
	//int budget ;
	switch (veh) {
		//int budget = 50000;
		case "Bike" : 
			if (budget >= 50000 && budget <= 60000) {
		System.out.println("Suggested bikes are Platina,Victor");}
		else if(budget > 60000 && budget <= 80000) {
			System.out.println("Suggested bikes are Splendar,Unicorn,Passion pro");}
			else if (budget > 80000 && budget <=100000) {
				System.out.println("Suggested bikes are FZ,Hornet,Pulsar,Xtreme");}
		      else
				System.out.println ("You have to change your budget");
				break;
			
		
		
		case "Moped" : 
			if(budget >=50000 && budget <= 60000 ) {
			System.out.println("Suggested mopeds are Scooty,Luna");}
		else if (budget > 60000 && budget <=80000) {
			System.out.println("Suggested mopeds are Activa,Dio,Jupiter ");}
			else if(budget > 80000 && budget <= 100000) {
				System.out.println("Suggested mopeds are Vespa");}
			 else
					System.out.println ("You have to change your budget");break;
		default:{ 
			System.out.println ("You have to change your budget");}
			}
		}
}		              
			
			
		
	


				
		
	



