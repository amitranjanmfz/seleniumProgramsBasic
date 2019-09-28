package Selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ImplicitWait {

    public static void main(String[] args) throws InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("http://www.ksrtc.in/oprs-web/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("html/body/div[4]/div/a[1]")).click();
/*
        WebElement elem=driver.findElement(By.xpath("sgdsh"));

        WebDriverWait wait=new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.elementToBeClickable(elem)).click();*/

    }

}
