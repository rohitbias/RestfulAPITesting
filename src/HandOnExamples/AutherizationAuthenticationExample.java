package HandOnExamples;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AutherizationAuthenticationExample {
	
	public static void main(String args[])
	{
		RestAssured.baseURI="http://restapi.demoqa.com/authentication/CheckForAuthentication";
		RequestSpecification request=RestAssured.given();
		
		request.auth().basic("ToolsQA", "TestPassword");
		
		/*other Authentication Methods:
		 * 
		 * request.auth().digest("userName", "password");
		 * 
		 * request.auth().form("userName", "password");
		 * 
		 * request.auth().oauth2("userName", "password");
		 */
		
		
	
		Response response=request.get();
		
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.body().asString());
	}

}
