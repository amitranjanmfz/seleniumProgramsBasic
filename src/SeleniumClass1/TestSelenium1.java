package SeleniumClass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium1 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in");
        driver.findElement(By.linkText("Try Prime")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='a-autoid-0']/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='ap_email']")).sendKeys("98e2989893232");
        driver.findElement(By.xpath(".//*[@id='continue']")).click();
        driver.close();

    }


}
