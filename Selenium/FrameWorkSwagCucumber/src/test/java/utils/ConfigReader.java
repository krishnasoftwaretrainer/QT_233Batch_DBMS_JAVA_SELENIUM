package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader 
{
	static Properties properties = new Properties();

	public static void loadProperties() throws IOException 
	{
	FileInputStream file = new FileInputStream("src/test/resources/config/config.properties");

			properties.load(file);
	}

	public static String getProperty(String key) {

		return properties.getProperty(key);
	}
}
