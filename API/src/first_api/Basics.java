package first_api;

import org.testng.annotations.Test;




import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Basics {
	
	@Test
	public void first() {
		
		//given - all inputs
		//when - resource,http request
		//then - validate response
		//Add place using Post request
		
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String response = given().log().all().queryParam("key", "qaclick123").header("Content-type","application/json")
		.body(Filus.addPlace()).when().post("maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200).body("scope",equalTo("APP"))
		.header("Server", "Apache/2.4.41 (Ubuntu)").extract().response().asString();
		
		JsonPath js = new JsonPath(response);
		String placeid = js.getString("place_id");
		System.out.println(placeid);
		
		//Update address of that resource using Put request
		
		String newadd = "Shastri Chowk, Bhosari";
		Object msg = given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
		.body("{\r\n"
				+ "\"place_id\":\""+placeid+"\",\r\n"
				+ "\"address\":\""+newadd+"\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}\r\n"
				+ "").when().put("maps/api/place/update/json")
		.then().log().all().assertThat().body("msg",equalTo("Address successfully updated"))
		.extract().path("msg");
		
		System.out.println(msg);
		
		//Get place 
		
		given().log().all().queryParam("key","qaclick123").queryParam("place_id",placeid)
		.when().get("maps/api/place/get/json")
		.then().log().all().assertThat().body("address",equalTo(newadd));
		
		
	}

}
