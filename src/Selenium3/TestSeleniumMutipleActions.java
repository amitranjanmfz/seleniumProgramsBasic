package Selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class TestSeleniumMutipleActions {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://facebook.com");
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.id("email"));
        Actions builder = new Actions(driver);
        Action seriesofActions = builder
                .moveToElement(username)
                .click()
                .keyDown(username,Keys.SHIFT)
                .sendKeys(username,"a")
                .keyUp(username,Keys.SHIFT)
                .sendKeys(username,"mit")
                .doubleClick(username)
                .contextClick()
                .build();
        seriesofActions.perform();

    }
}
