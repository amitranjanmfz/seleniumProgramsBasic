package Selenium3;

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
        driver.get("http://www.jobserve.com/in/en/Job-Search/"); //opening page

        driver.findElement(By.xpath("//span[text()='27 Industries Selected']")).click(); //clicking on drop down
        if((driver.findElement(By.id("ddcl-selInd-i0")).isSelected())){  //validating the checkbox is selected or not
            driver.findElement(By.id("ddcl-selInd-i0")).click();
        }
        //storing all the checkbox elements in the list
        List<WebElement> allCheckboxes=driver.findElements(By.xpath("//div[@id='ddcl-selInd-ddw']/div[@class='ui-dropdownchecklist-dropcontainer ui-widget-content']/div"));

        System.out.println(allCheckboxes.size());

        //synamix xpaths
        String xpath1="//input[@id='ddcl-selInd-i";
        String xpath3="']";
        for(int i=0;i<allCheckboxes.size();i++){
            //selecting 5th,7th and 9th checkbox
            if(i==5||i==7||i==9){
                driver.findElement(By.xpath(xpath1+i+xpath3)).click();
                Thread.sleep(2000);
            }
        }



























       /* driver.findElement(By.xpath(".//*[@id='ddcl-selInd']/span/span")).click();
        Thread.sleep(3000);
        boolean b1=driver.findElement(By.xpath(".//*[@id='ddcl-selInd-i0']")).isSelected();

        if(b1){
            driver.findElement(By.xpath(".//*[@id='ddcl-selInd-i0']")).click();
            System.out.println("Unchecked successfully");
        }else
        {
            System.out.println("Already Unchecked");
        }

        String xpath_start=".//*[@id='ddcl-selInd-i";
        String xpath_end="']";
        String xpath="10";

        *//*List<WebElement> lst=driver.findElements(By.xpath(".//*[@id='ddcl-selInd-ddw']/div/div"));
        System.out.println(lst.size());*//*

        for(int i=1;i<=5;i++){
            driver.findElement(By.xpath(xpath_start+i+xpath_end)).click();
        }
        *//*driver.findElement(By.xpath(xpath_start+xpath+xpath_end)).click();
        Thread.sleep(3000);
        WebElement var1=driver.findElement(By.xpath(".//*[@id='selAge']"));

        Select s=new Select(var1);
        s.selectByIndex(3);

        WebElement x=driver.findElement(By.xpath(".//*[@id='adOneSevenDay']/a"));
        x.getText();
        System.out.println(x.getText());*/


    }

}
