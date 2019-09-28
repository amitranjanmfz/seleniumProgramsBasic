package SeleniumClass3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandleAlert {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.americangolf.co.uk");

        WebElement elem=driver .findElement(By.xpath(".//*[@id='header-navigation']/div[1]/ul/li[1]/a"));

        Actions act=new Actions(driver);
        act.clickAndHold(elem).build().perform();

        Thread.sleep(2000);
        act.release().build().perform();








    }

}
