package first_api;

import org.testng.Assert;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;



public class Json_Prac {
	
	@Test
	public void jsonprac() {
		
		JsonPath js = new JsonPath(Filus.forjsonprac());
		
		int count = js.getInt("courses.size()");
		int total = 0;
		
		for(int i=0;i<count;i++) {
			
			int price = js.getInt("courses["+i+"].price");
			int copies = js.getInt("courses["+i+"].copies");
			
			int subtotal = price * copies;
			
			total = total +subtotal;
			
		}
		
		int amount = js.getInt("dashboard.purchaseAmount");
		
		Assert.assertEquals(total, amount);
		
		
		
		
		
		
		
	}
	

}
