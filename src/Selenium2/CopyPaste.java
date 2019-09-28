package Selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.naming.ldap.Control;

public class CopyPaste {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
        WebElement elem=driver.findElement(By.name("q"));
        elem.sendKeys("Selenium");
        elem.sendKeys(Keys.CONTROL+"a"); //select all
        elem.sendKeys(Keys.CONTROL+"x"); //cut all
        Thread.sleep(5000);
        elem.sendKeys(Keys.CONTROL+"v"); //paste





       /* driver.findElement(By.name("q")).sendKeys("Java Selenium");
        Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys(Keys.CONTROL + "a");
        Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys(Keys.CONTROL + "c");
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys(Keys.CONTROL +"v");*/


    }
}
