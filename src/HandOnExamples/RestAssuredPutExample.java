package HandOnExamples;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredPutExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int empId=1;
		
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1/employees";
		RequestSpecification request=RestAssured.given();
		
		JSONObject requestParams= new JSONObject();
		
		requestParams.put("name", "Zion"); // Cast
		requestParams.put("age", 23);
		requestParams.put("salary", 12000);
		
		request.body(requestParams.toJSONString());
	 
		Response response=request.put("/update/"+empId);
		
		int statusCode = response.getStatusCode();
		System.out.println(response.asString());

	}

}
