package rupeek.com.CustomFrameWork.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	//read the property file from the resource directory 
	//read items and return them
	//create property reader instance and call readItem with String
	static Properties properties;
	
	public PropertyReader() {
		loadAllProperties();
	}
	
	//load the file from the resourse 
	public void loadAllProperties() {
		properties = new Properties();
		//reads the file production_config.prpoperties
		try {
			
			String fileName = System.getProperty("user.dir")+"/CustomFrameWork/resource/production_config.properties";	
		    properties.load(new FileInputStream(fileName));
		}catch(IOException e) {
			throw new RuntimeException("Not able to find the file");
		}
	}
	
	//must perform resd items 
	public static String readItem(String propertyName) {
		return properties.getProperty(propertyName);
	}
}
