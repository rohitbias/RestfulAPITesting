package HandOnExamples;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredGetQueryParam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//create a request pointing to service endpoint
		RestAssured.baseURI="https://samples.openweathermap.org/data/2.5/";
		RequestSpecification  request=RestAssured.given();
		
		//send the resource details of the city, country, and the id to search the weather for in the GET request.
		Response response=request.queryParam("q","London,UK")
                .queryParam("appid", "2b1fd2d7f77ccf1b7de9b441571b39b8").
				get("/weather");
		System.out.println(response.getStatusCode());
		
		JsonPath jsonpath= response.jsonPath();
		System.out.println(jsonpath.get("name"));
		//
		
		

	}

}
