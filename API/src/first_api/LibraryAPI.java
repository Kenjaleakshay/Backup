package first_api;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LibraryAPI {
	
	
	public void libraryapi() {
		
		RestAssured.baseURI = "http://216.10.245.166";
		String response = given().log().all().header("Content-Type","application/json")
		.body(Filus.libraryapibody("key", "1001"))
		.when().post("Library/Addbook.php")
		.then().log().all().extract().response().asString();
		
		JsonPath js = Filus.jsonpathmethod(response);
	    String id = js.get("ID");
		System.out.println(id);
		
		//get book request
		
		String getresponse = given().log().all().queryParam("ID","keak1001")
		.when().get("/Library/GetBook.php")
		.then().log().all().extract().response().asString();
		
		JsonPath js1 = Filus.jsonpathmethod(getresponse);
		ArrayList book = js1.get("book_name");
		System.out.println(book);
		
		//delete book request
		
		String delresponse = given().header("Content-Type","application/json")
		.body("{\r\n"
				+ " \r\n"
				+ "\"ID\" : \""+id+"\"\r\n"
				+ " \r\n"
				+ "} \r\n"
				+ "")
		.when().delete("/Library/DeleteBook.php")
		.then().log().all().assertThat().body("msg",equalTo("book is successfully deleted"))
		.extract().response().asString();
		
		System.out.println(delresponse);
		
		
	}

	@Test
	public void byfromsavedfile() throws IOException {
		
		RestAssured.baseURI = "http://216.10.245.166";
		String response = given().log().all().header("Content-Type","application/json")
		.body(jsonpayload("E:\\RestAssured\\Input excel\\Json Post Paylaod.txt"))
		.when().post("Library/Addbook.php")
		.then().log().all().extract().response().asString();
		
	}
	
	public String jsonpayload(String path) throws IOException {
		
		String json = new String(Files.readAllBytes(Paths.get(path)));
		return json;
	}
	
	
	
	
	
	
	

}
