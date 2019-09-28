package SeleniumNewBatch1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class WindowHandler {

    public static void main(String[] args) throws InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://expedia.com/");
        driver.findElement(By.xpath("//a[contains(text(),'Egencia Business Travel')]")).click();

        Set<String> windows=driver.getWindowHandles();

        Iterator<String> it=windows.iterator();

       String parentWindow=it.next();
       String childWindow=it.next();

       driver.switchTo().window(childWindow);
       Thread.sleep(3000);

       driver.findElement(By.xpath("//li[@id='menu-item-3677']/a")).click();


    }
}
