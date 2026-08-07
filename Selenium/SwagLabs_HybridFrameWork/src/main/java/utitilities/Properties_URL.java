package utitilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties_URL 
{
	
	Properties prop;

    public Properties_URL() throws IOException {
        FileInputStream fis = new FileInputStream("./src/test/resources/URLProp.properties");
        prop = new Properties();
        prop.load(fis);
    }

    public String getApplicationURL(String key) {
        return prop.getProperty(key);
    }
}

