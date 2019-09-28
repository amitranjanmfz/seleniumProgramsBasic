package SeleniumNewBatch1;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.Set;

public class GridCode {

    public static void main(String[] args) throws InterruptedException, IOException {

        DesiredCapabilities cap=new DesiredCapabilities();


        cap.setBrowserName("chrome");
        cap.setPlatform(Platform.WINDOWS);


        String hubURL="http://192.168.56.1:4444/wd/hub";

        RemoteWebDriver driver=new RemoteWebDriver(new URL(hubURL),cap);

        driver.get("http://google.com/");

        Thread.sleep(5000);

        driver.quit();




    }


}