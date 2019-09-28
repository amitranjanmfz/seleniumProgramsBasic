package SeleniumNewBatch1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DynamicXpathSelection2 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.jobserve.com/in/en/Job-Search/");

        WebElement elem=driver.findElement(By.xpath(".//*[@id='ddcl-selInd']/span"));
        elem.click();
        WebElement elem1=driver.findElement(By.xpath(".//*[@id='ddcl-selInd-i0']"));
        if(elem1.isSelected()){
            elem1.click();
        }

        driver.findElement(By.xpath("//label[contains(text(),' HR & Recruitment')]//preceding-sibling::input")).click();



    }

}
