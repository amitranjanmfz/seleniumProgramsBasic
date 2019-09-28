package Selenium3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAndPopUp {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       /* driver.get("http://www.ksrtc.in/oprs-web/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-booking']")).click();

        Alert al=driver.switchTo().alert();
        al.accept();*/

       /* Alert al=driver.switchTo().alert();
        Thread.sleep(2000);
        System.out.println(al.getText());
        al.accept(); */
        driver.get("http://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");
        driver.findElement(By.xpath(".//*[@id='content']/button")).click();

        Alert al=driver.switchTo().alert();
        System.out.println(al.getText());
        Thread.sleep(2000);
        al.dismiss();
        al.accept();

    }
}
