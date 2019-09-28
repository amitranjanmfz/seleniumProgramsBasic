package SeleniumBatchFeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAssertion1 {


    @Test
    public void testAssert(){

/*
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in");
        String actualText=driver.findElement(By.xpath("//a[contains(@href,'/prime?ref=nav_logo_prime_join')]")).getText();
        Assert.assertTrue(actualText.equalsIgnoreCase("Try prime"));*/

        //Assert.fail("I am failing it purposefully");

        System.out.println("This is precondition");
        Assert.assertFalse(10<20);
        System.out.println("This is post condition");







    }



}
