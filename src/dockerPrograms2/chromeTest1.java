package dockerPrograms2;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class chromeTest1 {
	
	@BeforeTest
	public void startDockerScale() throws IOException, InterruptedException
	{
		File fi =new File("output.txt");
		if(fi.delete())
		{
			System.out.println("file deleted successfully");
		}
		startDocker s=new startDocker();
		s.startFile();
	}
	
	@AfterTest
	public void stopDockerDeleteFile() throws IOException, InterruptedException
	{
		stopDocker d=new stopDocker();
		d.stopFile();
		
		
	}

@Test(timeOut = 100)
public void test1() throws MalformedURLException
{
		// TODO Auto-generated method stub
DesiredCapabilities cap=DesiredCapabilities.chrome();
		URL u=new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver=new RemoteWebDriver(u,cap);
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
	}

}
