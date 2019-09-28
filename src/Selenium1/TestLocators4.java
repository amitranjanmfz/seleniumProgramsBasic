package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TestLocators4 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        List<WebElement> list = driver.findElements(By.tagName("a"));
        System.out.println("Number of links: "+list.size());
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).getText());
        }
    }
}
