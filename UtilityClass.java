package utilityObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtilityClass {

	public static WebDriver driver;     

	public static WebDriver getDriver() {
		
		if(driver==null) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\skr\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");		
		 driver= new ChromeDriver();
		 }

	     return driver;
	
	}






















}
