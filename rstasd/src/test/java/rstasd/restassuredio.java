package rstasd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;


public class restassuredio {
	public String baseurl = "https://ecommerceservice.herokuapp.com";
	public String message;
	public String accessToken;
	public String UserId;
	public String email;
	
	
	@Test(priority = 0, enabled=false)
	public void signup()
	{
		RestAssured.baseURI = baseurl;
		String requestbody = "{\r\n"
				+ "	\"email\": \"lll@gmail.com\",\r\n"
				+ "	\"password\": \"krjia@12\"\r\n"
				+ "}";
		
		Response response = given()
				            .header("content-Type","application/json")
				            .body(requestbody)
				            
				            .when()
				            .post("/user/signup")
				            
				            .then()
				            .assertThat().statusCode(201).contentType(ContentType.JSON)
				            .extract().response();
		
				            String jsonres = response.asString();
				            JsonPath js = new JsonPath(jsonres);
		                     message = js.get("message");
		                    System.out.println(message);
		                   // return requestbody;
		
				            
				            
	}
	@Test(priority=1)
	public void login()
	{
		RestAssured.baseURI = baseurl;
		String requestbody = "{\r\n"
				+ "	\"email\": \"lll@gmail.com\",\r\n"
				+ "	\"password\": \"krjia@12\"\r\n"
				+ "}";
		Response response = given()
	            .header("content-Type","application/json")
	            .body(requestbody)
	            
	            .when()
	            .post("/user/login")
	            
	            .then()
	            .assertThat().statusCode(200).contentType(ContentType.JSON)
	            .extract().response();
		
		  String jsonres = response.asString();
          JsonPath js = new JsonPath(jsonres);
           accessToken = js.get("accessToken");
          System.out.println(accessToken);
          //return requestbody;

	}
	@Test(priority=2)
	public void getallusers() 
	{
		RestAssured.baseURI = baseurl;
		Response response = given()
				.header("content-Type","application/json")
	            .header("Authorization", "bearer "+accessToken)
	            
		
	            .when()
	            .post("/user")
	            
	            .then()
	            .assertThat().statusCode(200).contentType(ContentType.JSON)
	            .extract().response();
			
			 String jsonres = response.asString();
	         JsonPath js = new JsonPath(jsonres);
	         System.out.println(jsonres);
	         UserId=js.get("user[28]._id");
	         System.out.println("userno: "+UserId);
	         //email=js.get("user[27].email");
	         //System.out.println("email: "+email);
	         // accessToken = js.get("accessToken");
	         //System.out.println(accessToken);
	            	         
	}
	@Test(priority=3)
	public void deleteuser()
	{
		RestAssured.baseURI = baseurl;
		Response response = given()
				.header("content-Type","application/json")
	            .header("Authorization", "bearer "+accessToken)
	            
		
	            .when()
	            .post("user/"+UserId)
	            
	            
	            .then()
	            .assertThat().statusCode(200).contentType(ContentType.JSON)
	            .extract().response(); 
		        
		String jsonres = response.asString();
        JsonPath js = new JsonPath(jsonres);
        message = js.getString("message");
		System.out.println(message);
		
	}

}
