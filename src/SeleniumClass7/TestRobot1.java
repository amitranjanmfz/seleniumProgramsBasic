package SeleniumClass7;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class TestRobot1 {

    @Test
    public void test1() throws AWTException, InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        Robot rb=new Robot();
        rb.keyPress(KeyEvent.VK_PAGE_DOWN);
        rb.keyRelease(KeyEvent.VK_PAGE_DOWN);
        Thread.sleep(2000);
        rb.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        rb.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        rb.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        rb.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        rb.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(2000);
        rb.keyPress(KeyEvent.VK_DOWN);

    }

}
