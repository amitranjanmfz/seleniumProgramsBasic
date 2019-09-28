package selenium6;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;


public class CustomListener extends TestListenerAdapter {
	
	public void onTestFailure(ITestResult tr) {
		
		try {
			File scrFile = ((TakesScreenshot)CaptureScreenshot.driver).getScreenshotAs(OutputType.FILE);
			// Now you can do whatever you need to do with it, for example copy somewhere
			FileUtils.copyFile(scrFile, new File("C:\\scr\\"+tr.getName()+".png"));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
