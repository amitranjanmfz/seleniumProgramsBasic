package selenium6;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CaptureScreenshot {

    public static WebDriver driver;


    @Test(priority=1)
    public void tc1() {

        String path = "C:\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        driver=new ChromeDriver();
        driver.get("http://www.google.com");
        //Assert.assertEquals("Test", "Test1");
        //	report.log("This is first class",true);   // commented this line
    }

    @Test(priority=2)
    public void tc2() {

        driver.findElement(By.name("q")).sendKeys("Selenium HQ");
        //Thread.sleep(2000);
        Assert.assertEquals("Test", "Test1");

    }

    @Test(priority=3)
    public void tc3() {

        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        Assert.assertEquals("Test", "Test2");

    }
}

