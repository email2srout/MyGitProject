package TestScriptsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestBaseClass {
	@Test
	public void callbrowserdriver()
	{
		System.setProperty("webdriver.chrome.driver","D:\\LocalProject\\SroutSeleniumProject\\MySeleniumProject\\DriverExe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/");
		
	}

}
