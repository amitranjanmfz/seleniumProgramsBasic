package seleniumClass5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import static java.util.concurrent.TimeUnit.SECONDS;

public class TestFluentWait {


    @Test
    public void test(){

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");
       // driver.findElement(By.xpath("//button[text()='Click Me - Fluent Wait']")).click();

        // for its presence once every 5 seconds.
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                WebElement element = driver.findElement(By.xpath("//a[@id='myAnchor']"));
                String getTextOnPage = element.getText();
                if(getTextOnPage.equals("Software Testing Material - DEMO PAGE")){
                    System.out.println(getTextOnPage);
                    return element;
                }else{
                    System.out.println("FluentWait Failed");
                    return null;
                }
            }
        });
    }

}
