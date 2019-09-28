package Selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TestSeleniumSelect1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.borland.com/gmopost/cgi-bin/perl.exe?ship-info.pl");
        WebElement dd=driver.findElement(By.name("CardType"));

        Select sel=new Select(dd);
        List<WebElement> x=sel.getOptions();
        for (WebElement lst:x){
            System.out.println(lst.getText());
        }
        Thread.sleep(2000);
        sel.selectByIndex(1);
        Thread.sleep(2000);
      // sel.selectByVisibleText("American Express");
      //  sel.selectByValue("AMEX");



    }

}
