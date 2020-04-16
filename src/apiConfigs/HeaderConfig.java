package apiConfigs;

import java.util.HashMap;
import java.util.Map;

public class HeaderConfig {
	
	public Map<String,String> defaultHeaders(){
		
		Map<String,String> defaultHeaders= new HashMap<String,String>();
		defaultHeaders.put("Content-Type","application/json");
		defaultHeaders.put("test-key","test-value");
		return defaultHeaders;
	}

	public Map<String,String> headerswithToken(){
		
		Map<String,String> defaultHeaders= new HashMap<String,String>();
		defaultHeaders.put("Content-Type","application/json");
		defaultHeaders.put("Access_Token","sdsadsadxzczxcascsac");
		defaultHeaders.put("jwt_Token","sdsadsadxzczxcascsac");
		defaultHeaders.put("test-key","test-value");
		return defaultHeaders;
	}



}
