package Selenium_explore;

public interface Common_Properties {
   String key1 = "webdriver.chrome.driver";
   String key2 = "webdriver.geckodriver.driver";
   String value1 = "E:\\VelocityTraining\\setup\\Chrome Driver\\chromedriver.exe";
   String value2 = "E:\\VelocityTraining\\setup\\Firefox Browser\\geckodriver.exe";
   String url1 = "https://www.facebook.com/login/";
   String url2 = "https://www.amazon.in/";
   String url3 = "https://www.makemytrip.com/flights/";
   
   default void welc() {
	   System.out.println("welcome");
   }
   void launchChrome();
   void launchFirefox();
   public static void succ() {
	   System.out.println("Launched successfully");
	   
   }
}
