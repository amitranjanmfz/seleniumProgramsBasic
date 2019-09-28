package seleniumClass6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestBrowsers1 {

    WebDriver driver;

    @BeforeTest
    @Parameters("browser")
    public void setup(String browser) throws Exception{


        if(browser.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
            driver = new ChromeDriver();

        }
        else if(browser.equals("mozilla")){

            System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
            driver = new ChromeDriver();

        }
    }

    @Test
    public void openURL(){

        driver.get("http://www.google.com");
        driver.manage().window().maximize();

    }
}
