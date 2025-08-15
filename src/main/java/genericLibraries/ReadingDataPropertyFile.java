package genericLibraries;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ReadingDataPropertyFile {
	public String getData(String key)throws FileNotFoundException,IOException{
		Properties properties=new Properties();
		properties.load(new FileInputStream(AutoConstant.propertyFilePath));
		return properties.getProperty(key);
		
	}
	
}
