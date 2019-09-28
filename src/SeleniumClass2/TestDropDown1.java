package SeleniumClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TestDropDown1 {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
        WebElement elem=driver.findElement(By.id("multi-select"));
        String[] s={"Ohio","California"};
        Select obj=new Select(elem);

        System.out.println(obj.isMultiple());

        if(obj.isMultiple()==true){

            List<WebElement> lst=obj.getOptions();

            for (int i=0;i<lst.size();i++){
                System.out.println(lst.get(i).getText());
              for(int j=0;j<s.length;j++) {
                  if (lst.get(i).getText().equals(s[j])) {
                      obj.selectByIndex(i);
                  }
              }


            }



        }






       }

}
