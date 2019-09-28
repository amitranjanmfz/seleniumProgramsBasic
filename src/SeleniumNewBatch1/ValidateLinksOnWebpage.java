package SeleniumNewBatch1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ValidateLinksOnWebpage {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
      //  driver.get("http://demo.borland.com/gmopost/cgi-bin/perl.exe?ship-info.pl");

        driver.get("http://expedia.com");

        List<WebElement> lst=driver.findElements(By.tagName("a"));

        System.out.println(lst.size());

      /*  for(WebElement ls:lst) {
            System.out.println(ls.getText());
        }
*/

        for(int i=0;i<lst.size();i++){
            System.out.println(lst.get(i));
            System.out.println(lst.get(i).getText());
            System.out.println(lst.get(i).getAttribute("href"));
        }








    }

}
