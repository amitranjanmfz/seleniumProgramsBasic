package SeleniumNewBatch1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.awt.event.KeyEvent;

public class TestSeleniumMutipleActions {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://facebook.com");
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.id("email"));
        Actions act = new Actions(driver);
        Action seriesofActions = act
                .moveToElement(username)
                .click()
                .keyDown(username,Keys.SHIFT)
                .sendKeys(username,"amit")
                .keyUp(username,Keys.SHIFT)
                .doubleClick(username)
                .contextClick()
                .build();
        seriesofActions.perform();

    }
}
