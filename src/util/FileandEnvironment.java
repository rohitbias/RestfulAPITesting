package util;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class FileandEnvironment {

	public static Map<String, String> environmentDetails = new HashMap<String, String>();
	public static Properties configProperty = new Properties();

	public static Map<String, String> envAndFile() {
		
		try {
		FileInputStream env = new FileInputStream(System.getProperty("user.dir") + "/inputs/config.properties");
		configProperty.load(env);
		
				environmentDetails.put("ServerUrl", configProperty.getProperty("ServerUrl"));
				environmentDetails.put("userName", configProperty.getProperty("userName"));
				environmentDetails.put("password", configProperty.getProperty("password"));
				environmentDetails.put("portNumber", configProperty.getProperty("portNumber"));

					} catch (Exception e) {
			System.out.println("Problem Lodaing Property File :" + e);
		}

		return environmentDetails;

	}

	public static Map<String, String> getConfigReader() {
		if (environmentDetails == null) {
			environmentDetails = envAndFile();

		}
		return environmentDetails;
	}

}
