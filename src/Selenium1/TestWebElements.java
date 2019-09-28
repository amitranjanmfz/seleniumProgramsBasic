package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TestWebElements {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='gb_Q gb_R']/a[text()='Gmail']")).click();

       /* List<WebElement> lst=driver.findElements(By.name("sex"));
        System.out.println("female radio button :"+lst.get(0).isSelected());
        System.out.println("male radio button :"+lst.get(1).isSelected());
        if(lst.get(0).isSelected()==false){
            lst.get(0).click();
        }
*/
    }
}
