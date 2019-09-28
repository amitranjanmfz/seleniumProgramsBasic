package Selenium4;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestScroll {

@Test
 public void Scroll() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	driver.manage().window().maximize();
	System.out.println(driver.manage().window().getSize());
	driver.get("http://www.cs.tut.fi/~jkorpela/forms/file.html");
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(0,1029)");
	 
	
	
	 }
}
