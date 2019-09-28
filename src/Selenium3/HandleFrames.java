package Selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandleFrames {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
        driver.manage().window().maximize();
        List<WebElement> lst=driver.findElements(By.tagName("frame"));
        System.out.println(lst.size());
        WebElement f1=driver.findElement(By.name("packageListFrame"));
        WebElement f2=driver.findElement(By.name("packageFrame"));
        WebElement f3=driver.findElement(By.name("classFrame"));

        driver.switchTo().frame(f2);

        System.out.println(driver.findElement(By.xpath("html/body/div[1]/ul/li[2]/a")).getText());
        driver.switchTo().defaultContent();
        driver.switchTo().frame(f3);
        driver.findElement(By.xpath("html/body/div[3]/table/tbody[2]/tr[9]/td[1]/a")).click();

    }
}
