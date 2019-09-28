package SeleniumClass4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class WindowHandler {

    public static void main(String[] args) throws InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://expedia.com");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.linkText("Expedia Affiliate Network (EAN)")).click();

        Set<String> winSet=driver.getWindowHandles();

        Iterator<String> it=winSet.iterator();
        /*int i=1;
        while(it.hasNext()){
            System.out.print("Window handler"+i);
            System.out.println(it.next());
            i++;
        }*/
        String mainWindow=it.next();
        String newWindow=it.next();

        driver.switchTo().window(newWindow);

        driver.findElement(By.xpath(".//*[@id='main-navigation']/li[7]/a")).click();

       driver.close();



    }
}
