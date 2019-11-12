package basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadWrite {
	
	public Properties  ReadProperties(String path) throws IOException {
		
		InputStream input = new FileInputStream(path);
		Properties proper = new  Properties();
				proper.load(input);
		return proper;
		
				
		
	}

	

}
