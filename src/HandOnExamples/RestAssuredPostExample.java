package HandOnExamples;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredPostExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	RestAssured.baseURI="http://restapi.demoqa.com/customer";
	RequestSpecification request= RestAssured.given();
	
	JSONObject requestParams=new JSONObject();
	 requestParams.put("FirstName", "Drishya"); // Cast
	 requestParams.put("LastName", "Bhatt");
	 requestParams.put("UserName", "complexuser04122020a");
	 requestParams.put("Password", "password1");
	 requestParams.put("Email",  "complexusera@yopmail.com");
	 
	 // Add a header stating the Request body is a JSON
	 request.header("Content-Type", "application/json");
	  
	 // Add the Json to the body of the request
	 request.body(requestParams.toJSONString());
	  
	 // Post the request and check the response
	 Response response = request.post("/register");
	 
	
		// Deserialize the Response body into RegistrationSuccessResponse
			RegistrationSuccessResponse responseBody = response.getBody().as(RegistrationSuccessResponse.class);
			
			System.out.println(responseBody.getFaultId());
			 System.out.println("\n\n************************************************************");
			 System.out.println(responseBody.getFault());
	
			
		 System.out.println("\n\n************************************************************");
	 
	
	
	}
}
