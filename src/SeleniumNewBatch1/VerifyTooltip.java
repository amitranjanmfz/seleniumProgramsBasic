package SeleniumNewBatch1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class VerifyTooltip {

    public static void main(String[] args) throws InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://facebook.com/");

        String expected_Tooltip="Go to Facebook home";

        String actual_tooltip=driver.findElement(By.xpath("//div/h1/a[contains(@href,'facebook.com')]")).getAttribute("title");

        System.out.println(actual_tooltip);

        Assert.assertEquals(expected_Tooltip,actual_tooltip);
    }
}
