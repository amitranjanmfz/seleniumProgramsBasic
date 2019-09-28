package dockerPrograms;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;


public class chromeTest1{


    @BeforeTest
    public void startFile() throws IOException, InterruptedException {

        System.out.println("Registering hubs and nodes...");

        Runtime.getRuntime().exec("cmd /c start C:\\Users\\amiranja3\\IdeaProjects\\BackUpClass\\dockerUp.bat");
        int flag=0;
        String f="C:\\Users\\amiranja3\\IdeaProjects\\BackUpClass\\output.txt";
        Calendar cal=Calendar.getInstance();
        cal.add(Calendar.SECOND,45);
        long stopNow=cal.getTimeInMillis();

        while(System.currentTimeMillis()<stopNow) {
            BufferedReader reader = new BufferedReader(new FileReader(f));
            String currentLine = reader.readLine();
            while (currentLine != null && flag==0) {
                if (currentLine.contains("Registering the node to the hub")) {
                    flag = 1;
                    System.out.println("Node Registered");
                    break;
                }
                currentLine=reader.readLine();
            }
            reader.close();
        }
        Thread.sleep(2000);
        if(flag==0)
            Assert.fail("Register error");
    }

    @AfterTest
    public void removehubAndNodes() throws IOException, InterruptedException {

        System.out.println("Removing hubs and nodes...");
        Runtime.getRuntime().exec("cmd /c start C:\\Users\\amiranja3\\IdeaProjects\\BackUpClass\\dockerDown.bat");
        Thread.sleep(20000);

    }

    @Test
     public void testDockerChrome() throws MalformedURLException {

         DesiredCapabilities cap=DesiredCapabilities.chrome();
         URL url=new URL("http://localhost:4444/wd/hub");
         RemoteWebDriver driver=new RemoteWebDriver(url,cap);
         driver.get("https://google.com");
         System.out.println("Title : "+driver.getTitle());
     }
    //have to create 4 containers--1 hub and 3 nodes

}
