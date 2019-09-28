package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TestLocator5 {

    public static void main(String[] args) {

        String path="C:\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        //driver.findElement(By.id("email")).sendKeys("abcdef");
        driver.findElement(By.partialLinkText("Forgotten")).click();

    }
}
