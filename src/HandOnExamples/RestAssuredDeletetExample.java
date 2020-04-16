package HandOnExamples;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredDeletetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int empId=15410;
		
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1/employees";
		RequestSpecification request=RestAssured.given();
		
		
		request.header("Content-Type", "application/json"); 
		Response response=request.delete("/delete/"+empId);
		
		int statusCode = response.getStatusCode();
		System.out.println(response.asString());

	}

}
