package com.demo;

import static io.restassured.RestAssured.given;
import io.restassured.RestAssured.*;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test; 
import static io.restassured.RestAssured.*;

public class RestForSoap {

	
	//RestAssured.baseURI="http://www.dneonline.com/calculator.asmx?op=Add";
	//@Test
	public void test_soapService(){
		
		
		Response res=given().request().body("C:\\Users\\Hidayath\\Desktop\\Request\\Add.xml").contentType("text/xml").
		param("SOAPAction","http://tempuri.org/Add").get("http://www.dneonline.com/calculator.asmx?op=Add").then().extract().response();
		
		System.out.println(res.asString());
	}
	
	@Test
public void test_soapService1(){
		
		/*
		given().request().body("C:\\Users\\Hidayath\\Desktop\\Request\\Add.xml").contentType("text/xml").
		param("SOAPAction","http://tempuri.org/Add").
		get("http://www.dneonline.com/calculator.asmx?op=Add").
		then().assertThat().body("//soap:Envelope/soap:Body/AddResponse/AddResult",equalTo("22"));*/
		
		
		/*given().body("C:\\Users\\Hidayath\\Desktop\\Request\\Add.xml").contentType("text/xml").
		param("SOAPAction","http://tempuri.org/Add").get("http://www.dneonline.com/calculator.asmx?op=Add").
		then().log().body();*/
		
		
		given().body("C:\\Users\\Hidayath\\Desktop\\Request\\getBank.xml").contentType("text/xml").
		post("http://www.thomas-bayer.com/axis2/services/BLZService").
		then().log().body();
	}
}
