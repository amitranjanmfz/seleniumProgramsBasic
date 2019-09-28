package Selenium1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGetMethod {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.amazon.in");
        System.out.println(driver.getCurrentUrl());







       // driver.findElement(By.id("nav-your-amazon")).click();
       // driver.findElement(By.xpath(".//*[@id='nav-your-amazon']")).click();
      //  driver.findElement(By.partialLinkText("Try")).click();


    }
}
