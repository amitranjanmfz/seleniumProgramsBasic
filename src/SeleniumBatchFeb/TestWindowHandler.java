package SeleniumBatchFeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class TestWindowHandler {

    public static void main(String[] args) throws InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://expedia.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//a[contains(text(),'Hotels.com')]")).click();

        Thread.sleep(4000);

        Set<String> windowHandlers=driver.getWindowHandles();

        Iterator<String> it=windowHandlers.iterator();

       /* while (it.hasNext()){
            System.out.println(it.next());
        }*/

       String mainWindow=it.next();   // returning the current window id
       String newWindow=it.next();  //returning the new window id

        driver.switchTo().window(newWindow);

        driver.findElement(By.name("q-destination")).sendKeys("New Delhi");

        driver.quit();






    }
}
