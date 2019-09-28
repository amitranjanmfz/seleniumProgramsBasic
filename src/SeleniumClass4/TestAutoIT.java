package SeleniumClass4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class TestAutoIT {


    public static void main(String[] args) throws InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.cs.tut.fi/~jkorpela/forms/file.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("html/body/form[1]/p[2]/input")).click();
        Thread.sleep(2000);
        Runtime.getRuntime().exec("C:\\Users\\amiranja3\\Desktop\\autoITFile-new.exe");

    }

}
