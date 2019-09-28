package SeleniumClass7;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Date;

public class TestJavaScriptExecutor1 {

    @Test
    public void test1() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");

        System.out.println("Start time: " + new Date());
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");

        System.out.println("Start time: " + new Date());

        String sText =  js.executeScript("return document.URL;").toString();
        System.out.println(sText);

        js.executeScript("history.go(0)");
        js.executeScript("alert('Welcome To QA');");

        Thread.sleep(2000);




    }

}
