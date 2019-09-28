package SeleniumClass2;

//import com.sun.glass.ui.Robot;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.Robot;
import java.awt.*;
import java.awt.event.KeyEvent;


public class TestCopyPaste {


    public static void main(String[] args) throws InterruptedException, AWTException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        WebElement var=driver.findElement(By.id("lst-ib"));
        var.sendKeys("Selenium");
        Thread.sleep(2000);
        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);  // press arrow down key of keyboard to navigate and select Save radio button

        Thread.sleep(2000);  // sleep has only

        robot.keyPress(KeyEvent.VK_ENTER);






        /*var.sendKeys(Keys.CONTROL +"a");
        var.sendKeys(Keys.CONTROL +"x");
        Thread.sleep(2000);
        driver.navigate().refresh();
        driver.findElement(By.id("lst-ib")).sendKeys(Keys.CONTROL + "v");
        */
    }
}
