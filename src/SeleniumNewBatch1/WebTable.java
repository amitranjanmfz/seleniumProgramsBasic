package SeleniumNewBatch1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTable {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demo.borland.com/gmopost/");

        driver.manage().window().maximize();

        driver.findElement(By.name("bSubmit")).click();

        WebElement table1=driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td/div/center/table/tbody"));

        List<WebElement> allTrs=table1.findElements(By.xpath("tr"));

        for(WebElement TR:allTrs){

            List<WebElement> allTds=TR.findElements(By.xpath("td"));
            for(WebElement TD:allTds){
                System.out.print(TD.getText()+" ");
            }
            System.out.println();


        }



    }
}
