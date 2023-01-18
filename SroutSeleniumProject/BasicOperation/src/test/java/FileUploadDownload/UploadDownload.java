package FileUploadDownload;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadDownload {

	public static void main(String[] args) throws InterruptedException 
	{
		String filepath = "D:\\LocalProject\\SroutSeleniumProject\\BasicOperation\\FileUpandDown\\Test1.txt";
		System.setProperty("webdriver.chrome.driver","D:\\LocalProject\\SroutSeleniumProject\\MySeleniumProject\\DriverExe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationtestinginsider.com/");
		WebElement  w1 = driver.findElement(By.linkText("DEMO WEBSITES"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", w1);
		Thread.sleep(800);
		w1.click();
		Thread.sleep(800);
		WebElement w2 = driver.findElement(By.linkText("Different Elements on a Web Page"));
		w2.click();
		Thread.sleep(800);
		WebElement w3 = driver.findElement(By.id("fileupload1"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", w3);
		Thread.sleep(800);
		w3.sendKeys(filepath);
		w3.click();
		
		

	}

}
