package beans;

import java.util.Properties;
import java.util.Set;

public class Test {
	private String user;
	private String email;
	private int age;
	private Properties driver;

	public Properties getDriver() {
		return driver;
	}

	public void setDriver(Properties driver) {
		this.driver = driver;
	}

	public Test(String user, String email, int age) {
		super();
		this.user = user;
		this.email = email;
		this.age = age;
	}

	
	public void printUserInfo() {
		System.out.println("User Name - " + user + " .........  Email - " + email + " ........   Age - " + age);
		Set key=driver.keySet();
		
		for(Object keys:key) {
			System.out.println("key : "+keys +" Value : "+driver.getProperty(keys.toString()));
		}
	}

}
