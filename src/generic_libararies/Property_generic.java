package generic_libararies;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Property_generic
{
	public static String property(String path,String key) throws FileNotFoundException, IOException
	{
		Properties p=new Properties();
		p.load(new FileInputStream(path));
		
		String data = p.getProperty(key);
		System.out.println(data);
		return data;
	}
}
