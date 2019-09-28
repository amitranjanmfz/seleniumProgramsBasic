package SeleniumNewBatch1;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
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

        WebElement elem=driver.findElement(By.xpath("(//a[contains(text(),'Golf Clubs')])[4]"));
        Actions act=new Actions(driver);
        Thread.sleep(4000);
        act.clickAndHold(elem).build().perform();

        Thread.sleep(3000);
        act.release().build().perform();

        Point location=elem.getLocation();
        System.out.println(location.getX());
        System.out.println(location.getY());






    }
}
