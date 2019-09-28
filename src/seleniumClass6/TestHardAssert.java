package seleniumClass6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestHardAssert {

    @Test
    public void test1(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://mail.google.com/");
        driver.findElement(By.xpath("//span[@class='RveJvd snByac' and text()='Next']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Enter an email or phone number']")).isDisplayed());

    }



}
