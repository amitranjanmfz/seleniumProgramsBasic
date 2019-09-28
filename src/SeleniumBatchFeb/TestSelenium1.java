package SeleniumBatchFeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TestSelenium1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.toolsqa.com/automation-practice-form");
        driver.findElement(By.xpath("//input[@type='text' and @name='firstname']")).sendKeys("Akhil");
        driver.findElement(By.xpath("//input[@type='text' and @name='lastname']")).sendKeys("Raj");

        driver.findElement(By.id("sex-0")).click();

        Select sel=new Select(driver.findElement(By.xpath("//select[@id='continents']")));

        List<WebElement> getAllContinents=sel.getOptions();
        for(WebElement x:getAllContinents){
            System.out.println(x.getText());
        }
        sel.selectByVisibleText("Europe");
        Thread.sleep(5000);
        sel.selectByIndex(0);
        Thread.sleep(5000);
        System.out.println(sel.isMultiple());

       /*Select sel=new Select(driver.findElement(By.id("selenium_commands")));
        System.out.println(sel.isMultiple());
        List<WebElement> getAllContinents=sel.getOptions();
        for(WebElement x:getAllContinents){
           // System.out.println(x.getText());
            Thread.sleep(2000);
            sel.selectByVisibleText(x.getText());
        }*/

       sel.deselectAll();

       System.out.println(sel.getFirstSelectedOption().getText());











    }

}
