package techfiosAPI2;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class APIPost2 {
 @Test
	
	public void  aPI_Post2() {
	 
//baseURI = "https://reqres.in/api/users";

JSONObject request = new JSONObject();
request.put("name", "Ram");
request.put("job", "BA");
System.out.println(request);	

given().
	header("Content-Type", "application/json").
	body(request.toJSONString()).
when ().
	put("https://reqres.in/api/users").
then().
	statusCode(200).
	log().all();
	
 }
}
