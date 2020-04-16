package HandOnExamples;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAsuredGetExample {
	@Test
	public void GetWeatherDetails()
	{   
		//// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		//Response response = httpRequest.request(Method.GET, "/Hyderabad");
		Response response = httpRequest.get("/Hyderabad");
		
		System.out.println("\n\n************************************************************");
		System.out.println(response.getStatusCode());
		System.out.println("\n\n************************************************************");
		System.out.println(response.getStatusLine());
		System.out.println("\n\n************************************************************");
		Headers h=response.getHeaders();
		for(Header xx:h)
		{
			System.out.println(xx);
		}
		System.out.println("\n\n************************************************************");
		System.out.println(response.getHeader("Content-Type"));
		System.out.println("\n\n************************************************************");
		System.out.println(response.body().asString());
		System.out.println("\n\n************************************************************");
		System.out.println(response.getBody().asString());
		System.out.println("\n\n************************************************************");
		JsonPath jsonpath=response.jsonPath();
		System.out.println(jsonpath.get("WindSpeed"));
		System.out.println("\n\n************************************************************");
		System.out.println(jsonpath.get());
		System.out.println("\n\n************************************************************");
	
	}
	}