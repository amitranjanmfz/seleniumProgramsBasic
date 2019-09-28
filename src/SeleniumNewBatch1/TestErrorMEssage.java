package SeleniumNewBatch1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestErrorMEssage {

    @Test
    public void TestError()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.naukri.com/");
        driver.findElement(By.xpath("//div[@class='mTxt' and text()='Login']")).click();
        driver.findElement(By.xpath("//button[@value='Login']")).click();
        String actual_msg=driver.findElement(By.id("eLoginNew_err")).getText();
        String expect="Please enter your Email ID / Username";
        Assert.assertEquals(actual_msg, expect);
        driver.quit();

 }
}