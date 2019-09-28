package SeleniumNewBatch1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
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
        WebElement elem= driver.findElement(By.xpath("//td/select[@name='CardType']"));
        Select sel=new Select(elem);

        List<WebElement> lst=sel.getOptions();

        //  driver.findElement(By.xpath("//td/input[@name='billName']")).sendKeys("Name123");




        /*System.out.println(sel.getFirstSelectedOption().getText());
        sel.selectByIndex(1);
        sel.selectByVisibleText("MasterCard");

        WebElement elem1=driver.findElement(By.xpath("//td/input[@name='shipSameAsBill']"));

        System.out.println(elem1.isSelected());
        if(elem.isSelected()==false){
            elem1.click();
            System.out.println(elem1.isSelected());
        }
        driver.findElement(By.name("bSubmit")).click();


        Alert al=driver.switchTo().alert();
        System.out.println(al.getText());

        al.accept();*/








    }

}
