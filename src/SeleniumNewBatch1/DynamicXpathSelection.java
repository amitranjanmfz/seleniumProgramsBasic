package SeleniumNewBatch1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DynamicXpathSelection {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.jobserve.com/in/en/Job-Search/");

        WebElement elem=driver.findElement(By.xpath(".//*[@id='ddcl-selInd']/span"));
        elem.click();

        List<WebElement> allElements=driver.findElements(By.xpath(".//*[@id='ddcl-selInd-ddw']/div/div"));

        System.out.println(allElements.size());

        String xpath1="//*[@id='ddcl-selInd-i";
        String xpath3="']";

        for(int i=0;i<allElements.size();i++){

            if(i==0 & driver.findElement(By.xpath(xpath1+i+xpath3)).isSelected()){
                driver.findElement(By.xpath(xpath1+i+xpath3)).click();
            }


            if(i==5||i==3){
                driver.findElement(By.xpath(xpath1+i+xpath3)).click();
            }

        }






    }

}
