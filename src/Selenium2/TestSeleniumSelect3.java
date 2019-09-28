package Selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TestSeleniumSelect3 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.toolsqa.com/automation-practice-form");
        WebElement dd=driver.findElement(By.id("selenium_commands"));

        Select sel=new Select(dd);
        List<WebElement> x=sel.getOptions();
        for (WebElement lst:x){
            System.out.println(lst.getText());
            sel.selectByVisibleText(lst.getText());
        }
        System.out.println(sel.isMultiple());
        sel.deselectAll();

      // sel.selectByVisibleText("American Express");
      //  sel.selectByValue("AMEX");



    }

}
