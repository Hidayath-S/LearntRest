package com.demo;

import org.testng.annotations.Test; 
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Test1_BasicFeatures {
	
	// check the status code
	//@Test
	public void testStatusCode(){
		given().get("https://jsonplaceholder.typicode.com/posts/3").
		then().statusCode(200);
	}
	
	@Test
	public void testEqualToFunction(){
		given().get("http://services.groupkt.com/country/get/iso2code/US").
		then().
		body("RestResponse.result.name",equalTo("United States of America")).log().all();
	}
	//@Test
	public void testHasItemFunction(){
		given().get("http://services.groupkt.com/country/get/all").
		then().
		body("RestResponse.result.name",hasItems("Afghanistan","Argentina","Australia"));
	}

}
