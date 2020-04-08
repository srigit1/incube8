package commons;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class PropertyReader {
	
	static Properties properties;

    public  static void  readProperties() throws IOException {

    	properties = new Properties();
    	           
    	try {
			FileInputStream input = new FileInputStream("src/test/resources/config.properties");
			properties.load(input);
			
		}
    	
    	
    	catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} 
    }
			
  public static  String getObject(String Data) throws IOException
   {
	   readProperties();
	   String data=properties.getProperty(Data);
	   return data;
   }
}
