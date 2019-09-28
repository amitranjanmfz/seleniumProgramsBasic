package SeleniumNewBatch1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestAssertion {

    @Test
    public void testAssert(){

        /*System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.amazon.com");

        String logo=driver.findElement(By.xpath("//div[@id='nav-logo']/a")).getText();*/

        String logo="Amazon1";
        String expectedTest="Amazon";

     //   Assert.assertEquals(logo,expectedTest,"failing because of mismatch of logo");
      //  Assert.assertTrue(logo.equalsIgnoreCase(expectedTest));

        SoftAssert sf=new SoftAssert();

        sf.assertEquals(logo,expectedTest,"logo mismatch");

        System.out.println("This is selenium");

        sf.assertAll();

    }



}
