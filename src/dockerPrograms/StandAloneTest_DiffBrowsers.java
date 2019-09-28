package dockerPrograms;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class StandAloneTest_DiffBrowsers {


     @Test
     public void testDockerChrome() throws MalformedURLException {

         DesiredCapabilities cap=DesiredCapabilities.chrome();
         URL url=new URL("http://localhost:4444/wd/hub");
         RemoteWebDriver driver=new RemoteWebDriver(url,cap);
         driver.get("https://google.com");
         System.out.println("Title : "+driver.getTitle());
     }

    @Test
    public void testDockerFirefox() throws MalformedURLException {

        DesiredCapabilities cap=DesiredCapabilities.firefox();
        URL url=new URL("http://localhost:4444/wd/hub");
        RemoteWebDriver driver=new RemoteWebDriver(url,cap);
        driver.get("https://google.com");
        System.out.println("Title : "+driver.getTitle());
    }


    //have to create 4 containers--1 hub and 3 nodes


}
