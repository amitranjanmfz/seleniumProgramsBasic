package SeleniumNewBatch1;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HeadlessBrowser {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

        ChromeOptions option=new ChromeOptions();

//Set the setHeadless is equal to true which will run test in Headless mode
        option.setHeadless(true);

// pass the option object in ChromeDriver constructor
        WebDriver driver=new ChromeDriver(option);
        driver.get("http://demo.borland.com/gmopost/cgi-bin/perl.exe?ship-info.pl");
        WebElement elem= driver.findElement(By.xpath("//td/select[@name='CardType']"));
        Select sel=new Select(elem);

        List<WebElement> lst=sel.getOptions();
        for (WebElement ls:lst){
            System.out.println(ls.getText());
        }

        driver.quit();

    }}