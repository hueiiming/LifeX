package common;

import java.util.Properties;

import config.EmailConstants;

public class PropertiesEmail {

	public static Properties setEmailProperties() {
		Properties props = new Properties();
		
		props.put("mail.smtp.auth", "true"); 
		props.put("mail.smtp.starttls.enable", "true"); 
		props.put("mail.smtp.host", EmailConstants.HOST); 
		props.put("mail.smtp.port", EmailConstants.PORT); 

		return props;
	}
	
}
