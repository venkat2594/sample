package firsttest;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
	
	public static void main(String[] args) {
		WebDriver driver;
		
		 System.setProperty("webdriver.gecko.driver","C:\\selenium\\selenium-java-3.141.59\\firefox\\geckodriver.exe");
			File pathBinary = new File("C:\\Users\\VENKAT\\AppData\\Local\\MozillaFirefox\\firefox.exe");
			 driver = new FirefoxDriver();
			 driver.manage().window().maximize();
			 driver.get("https://www.facebook.com/");
			 
			
			 
			
			 
			 
	}
	
	

}
