package seleniumClass6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Test1 {

    @Test
    public void test1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //driver.get("http://www.google.com");
        driver.get("http://expedia.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='Online Shopping']")).click();
        Set<String> winSet = driver.getWindowHandles();

        Iterator<String> it = winSet.iterator();

        String mainWindow = it.next();
        String newWindow = it.next();
        System.out.println("on new window");
        driver.switchTo().window(newWindow);
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//*[@class='zWatch zText'])[1]")).click();

        driver.switchTo().defaultContent();
        Thread.sleep(1000);
        System.out.println("on main window");
        driver.switchTo().window(mainWindow);
        driver.findElement(By.xpath(".//*[@id='primary-header-hotel']")).click();

        driver.close();
    }

}








