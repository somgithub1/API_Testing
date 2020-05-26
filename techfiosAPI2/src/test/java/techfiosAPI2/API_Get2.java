package techfiosAPI2;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
public class API_Get2 {

	@Test
	public void aPITest() {
		
		given().
			get("https://reqres.in/api/users?page=2").
		then().
			statusCode(200).
			log().all();
		
		
		
	}
	
	
	
}
