package com.jenkins.demo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

public class Deserelization {

			@Test
			public void testpojo() {
				
				RestAssured.baseURI="https://reqres.in/api/users?page=2";
				Serialization pojo=given()
				.when()
				.get()
				.as(Serialization.class);
				
				
				
				System.out.println(pojo.toString());
				
				
			}
}
