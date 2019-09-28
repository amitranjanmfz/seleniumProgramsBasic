package SeleniumBatchFeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TestFrames2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");


        List<WebElement> frames=driver.findElements(By.tagName("frame"));

        System.out.println(frames.size());

        for(WebElement x:frames){
            System.out.println(x.getAttribute("title"));
        }

       /* driver.switchTo().frame(frames.get(0));

        driver.findElement(By.xpath("//a[text()='com.thoughtworks.selenium']")).click();

       // driver.switchTo().defaultContent();

        driver.switchTo().frame(frames.get(2));

        driver.findElement(By.xpath("//a[text()='com.thoughtworks.selenium']")).click();*/

    }

}
