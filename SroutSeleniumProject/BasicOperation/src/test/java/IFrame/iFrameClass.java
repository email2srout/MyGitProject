package IFrame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\LocalProject\\SroutSeleniumProject\\MySeleniumProject\\DriverExe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		List <WebElement> iframes = driver.findElements(By.tagName("iframe"));
		for(WebElement w:iframes)
		{
			String iname = w.getAttribute("ID");
			driver.switchTo().frame(iname);
		}
		//or
		int count = driver.findElements(By.tagName("iframe")).size();
		for (int i=0;i<=count;i++)
		{
			driver.switchTo().frame(i);
		}
		//
		driver.switchTo().parentFrame();
		//
		driver.switchTo().defaultContent();
		//
		driver.switchTo().frame("ID");
		driver.findElement(By.id("ID")).click();

	}

}
