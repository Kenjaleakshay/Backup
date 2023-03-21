package practiceSelenium;

public class Execut_Monktest extends Monkey_Testing {
	
	public static void main(String[] args) throws InterruptedException {
		
		Execut_Monktest d = new Execut_Monktest();
		d.launchurl();
		Thread.sleep(2000);
		//d.monkeytest();
		d.settingsize();
		Thread.sleep(2000);
		d.settingpos();
	}

}
