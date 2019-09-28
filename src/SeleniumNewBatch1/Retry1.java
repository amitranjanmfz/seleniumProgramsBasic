package SeleniumNewBatch1;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Retry1 {

    @Test(retryAnalyzer=RetryFailedTestCases.class)
    public void test(){

        Assert.assertEquals("abc","def");


    }


}

