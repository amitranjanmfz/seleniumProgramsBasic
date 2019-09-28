package Selenium2;

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

        WebElement table=driver.findElement(By.xpath("//center/table[@border='1']"));
        List<WebElement> rows=table.findElements(By.xpath("tbody/tr"));
        for(WebElement elem:rows){
            List<WebElement> cols=elem.findElements(By.xpath("td"));
            for(WebElement c:cols){
                System.out.print(c.getText()+ " ");
            }
            System.out.println();
        }






       /* WebElement table = driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td/div/center/table"));
        List<WebElement> trows=table.findElements(By.xpath("tbody/tr"));
        for(WebElement el:trows){

            List<WebElement> tcols=el.findElements(By.xpath("td"));
            for(WebElement col:tcols){
                System.out.print(col.getText());
            }
            System.out.println();



        }
*/


    }
}
