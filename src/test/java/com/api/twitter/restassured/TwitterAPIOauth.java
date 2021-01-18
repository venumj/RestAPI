package com.api.twitter.restassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TwitterAPIOauth {
	
	@Test
	public void RestAssuredOauth() {
		
		RequestSpecification request = new RestAssured().given();
		request.baseUri("https://jsonplaceholder.typicode.com");
		Response resp = request.get("/todos/1");
		System.out.println(resp);
		System.out.println("Status code will be: "+resp.getStatusCode());
		System.out.println("Response in Json format: \n"+resp.jsonPath().prettify());
		
	}

}
