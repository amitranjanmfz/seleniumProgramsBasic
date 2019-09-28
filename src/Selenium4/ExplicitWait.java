package Selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class ExplicitWait {


    public static void main(String[] args) throws InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.ksrtc.in/oprs-web/");
        driver.manage().window().maximize();



        WebDriverWait wait=new WebDriverWait(driver,10);
        WebElement elem=driver.findElement(By.xpath(".//*[@id='searchBtn']"));
        wait.until(ExpectedConditions.elementToBeClickable(elem)).click();

    }
}
