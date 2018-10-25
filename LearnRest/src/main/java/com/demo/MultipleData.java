package com.demo;


import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


import org.testng.annotations.*;
public class MultipleData {

	
	@Test
	public void test1_service(){
		String[] arr1={"IN","US","AL","AS","AD"};
		for(int i=0;i<=arr1.length;i++){
			if(i<arr1.length){

				given().get("http://services.groupkt.com/country/get/iso2code/"+arr1[i]).
				then().statusCode(200).log().all();
				
			}
			
		}
		
	}
}
