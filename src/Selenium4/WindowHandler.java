package Selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class WindowHandler {

    public static void main(String[] args) throws InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://expedia.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath(".//*[@id='expedia-partners-links']/li[6]/a")).click();
        Set<String> winSet=driver.getWindowHandles();

        Iterator<String> it=winSet.iterator();
        /*int i=1;
        while (it.hasNext()){
            System.out.println("window handler "+ i+ " : "+ it.next());
            i++;
          }*/
        String mainWindow=it.next();
        String newWindow=it.next();
        System.out.println("on new window");
        driver.switchTo().window(newWindow);

        driver.findElement(By.xpath(".//*[@id='promo-cell-0']/div/ul/li[1]/a")).click();

        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        System.out.println("on main window");
        driver.switchTo().window(mainWindow);
        driver.findElement(By.xpath(".//*[@id='primary-header-hotel']")).click();

        driver.close();












    }
}
