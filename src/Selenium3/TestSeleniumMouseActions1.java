package Selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestSeleniumMouseActions1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.americangolf.co.uk");

        Actions act=new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Golf Clubs') and @class='a-level-1']"))).build().perform();
        Thread.sleep(2000);

      WebElement elem=driver.findElement(By.xpath("//a[contains(text(),'Golf Clubs') and @class='a-level-1']"));
        System.out.println("coordinate of golf club :"+elem.getLocation());

      WebElement elem2= driver.findElement(By.xpath("//a[contains(text(),'Clothing & Shoes') and @class='a-level-1']"));
        System.out.println("location of clothing and shoes : "+elem2.getLocation());

        act.dragAndDropBy(elem,100,0).build().perform();








/*
        WebElement Golf_Menu = driver.findElement(By.xpath(".//*[@id='header-navigation']/div[1]/ul/li[1]/a"));
        Actions act=new Actions(driver);
        Thread.sleep(4000);
        act.clickAndHold(Golf_Menu).build().perform();
        Thread.sleep(2000);
        act.release().build().perform();*/


    }
}
