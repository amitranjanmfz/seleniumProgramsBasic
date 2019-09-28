package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test2 {
    public static void main (String [] args){
        // Open Browser
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://mail.google.com");

        driver.findElement(By.name("identifier")).sendKeys("amitranjan");
    }
}
