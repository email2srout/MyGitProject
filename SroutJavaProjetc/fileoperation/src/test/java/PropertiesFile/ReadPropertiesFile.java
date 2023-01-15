package PropertiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) {
		
	try {
		Properties p = new Properties();
		String proPath = System.getProperty("user.dir");
		System.out.println(proPath);
		InputStream fis = new FileInputStream(proPath+"/src/test/resources/configProperties/config.properties");
		p.load(fis);
		String val = p.getProperty("Browser");
		System.out.println(val);
		OutputStream out = new FileOutputStream(proPath+"/src/test/resources/configProperties/config.properties");
		p.setProperty("Location","BBSR");
		p.store(out, "OK");
	}catch(Exception e)
	{
		e.printStackTrace();
	}
		

	}

}
