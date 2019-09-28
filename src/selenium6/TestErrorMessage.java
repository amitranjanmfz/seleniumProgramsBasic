package selenium6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestErrorMessage {

    @Test
    public void test1(){

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("http://mail.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath(".//*[text()='Next']")).click();
        if(driver.findElement(By.xpath("//div[text()='Enter an email or phone number']")).isDisplayed()){
            Assert.assertTrue(true);
            System.out.println("Error message visible");
        }

        else
            Assert.fail("error message not present");



    }
}
