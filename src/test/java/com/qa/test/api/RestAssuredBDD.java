package com.qa.test.api;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class RestAssuredBDD {

	@Test
	public void testProfiles() {
		
		given().
		when().
		 get("http://localhost:3000/posts").
		then().
		 assertThat().body("author",hasSize(9));
	}
	
	
}
