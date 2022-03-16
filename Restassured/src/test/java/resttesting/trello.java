package resttesting;
import org.testng.annotations.Test;
import com.fasterxml.jackson.core.JsonParseException;
import static io.restassured.RestAssured.given;
import  io.restassured.RestAssured;
import  io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
public class trello {
	public static String baseurl ="https://api.trello.com";
	public static String id;
	@Test(priority = 0)
	public void createBoard()
	{
		RestAssured.baseURI = baseurl;
		
		
		Response response =	 given()
				.queryParam("name", "akshy board")
		.queryParam("key","d82c9b384cd82dae9f4fa4d26d2eb200")
		.queryParam("token","43f9ccff8083888c45f18eceebae4d8dea4857522cde68c391cc6fdf198c1b2b")
		.header("content-Type","application/json")
		
		.when()
		.post("/1/boards/")
		
		.then()
		.assertThat().statusCode(200).contentType(ContentType.JSON)
		.extract().response();
		//this is to fetch the response as string
		String jsonresponse = response.asString();
		//I WANT TO CONVERT THE RESPONSE IN JSON FORMAT
		JsonPath js = new JsonPath(jsonresponse);
		//now i have to fetch the id
		id = js.get("id");
		System.out.println(id);
	}
	//if i make any @Test method enabled =false/ that method will not execute
	
		@Test(priority = 1)
		public void getBoard()
		{
			RestAssured.baseURI = baseurl;
			
			
		given()
			.queryParam("key", "d82c9b384cd82dae9f4fa4d26d2eb200")
			.queryParam("token", "43f9ccff8083888c45f18eceebae4d8dea4857522cde68c391cc6fdf198c1b2b")
			.header("Content-Type","application/json")
			
			.when()
			.get("/1/boards/"+id)
			
			.then()
			.assertThat().statusCode(200).contentType(ContentType.JSON)
			.extract().response();	
		
		}
		
		@Test(priority = 2)
		public void DeleteBoard()
		{
			RestAssured.baseURI = baseurl;
			
			
		Response response =	given()
			.queryParam("key", "d82c9b384cd82dae9f4fa4d26d2eb200")
			.queryParam("token", "43f9ccff8083888c45f18eceebae4d8dea4857522cde68c391cc6fdf198c1b2b")
			.header("Content-Type","application/json")
			
			.when()
			.delete("/1/boards/"+id)
			
			.then()
			.assertThat().statusCode(200).contentType(ContentType.JSON)
			.extract().response();	
			String jsonresponse = response.asString();
			
			System.out.println(jsonresponse);
		}
	}