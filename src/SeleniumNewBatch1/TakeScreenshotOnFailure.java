package SeleniumNewBatch1;

        import java.io.File;
        import org.apache.commons.io.FileUtils;
        import org.openqa.selenium.By;
        import org.openqa.selenium.OutputType;
        import org.openqa.selenium.TakesScreenshot;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.firefox.FirefoxDriver;
        import org.testng.Assert;
        import org.testng.ITestResult;
        import org.testng.annotations.AfterMethod;
        import org.testng.annotations.Test;

public class TakeScreenshotOnFailure {

    WebDriver driver;

    @Test
    public void captureScreenshot() throws Exception
    {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.facebook.com");
        Assert.assertEquals("a","a");


    }

    @AfterMethod
    public void tearDown(ITestResult result)
    {

        System.out.println(result.FAILURE);
        if(ITestResult.FAILURE==result.getStatus())
        {
            try
            {
                TakesScreenshot ts=(TakesScreenshot)driver;
                File source=ts.getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(source, new File("./Screenshots/"+result.getName()+".png"));
                System.out.println("Screenshot taken");
            }
            catch (Exception e)
            {

                System.out.println("Exception while taking screenshot "+e.getMessage());
            }

        }
        driver.quit();
    }



}