package Selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TestSeleniumSelect2 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
        WebElement elem=driver.findElement(By.id("multi-select"));
        Select sel=new Select(elem);
        List<WebElement> lst=sel.getOptions();
        sel.selectByIndex(0);
        sel.selectByIndex(2);
        Thread.sleep(2000);
        sel.deselectAll();
        Thread.sleep(2000);
        for(int i=0;i<lst.size();i++){
            sel.selectByIndex(i);
            System.out.println("selected option :"+lst.get(i).getText());
          //  Thread.sleep(2000);
        }
        sel.deselectAll();
        System.out.println(sel.isMultiple());

    }
}
