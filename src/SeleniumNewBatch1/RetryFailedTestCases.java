package SeleniumNewBatch1;

import org.testng.IRetryAnalyzer;

import org.testng.ITestResult;


public class RetryFailedTestCases implements IRetryAnalyzer{

     int minretryCount=0;
     int maxretryCount=2;

      public boolean retry(ITestResult result) {

 //    run until max count completes if test pass it will come out of for loop
        if (minretryCount <= maxretryCount)

        {
            System.out.println("Following test is failing====" + result.getName());
            System.out.println("Retrying the test Count is=== " + (minretryCount + 1));
            minretryCount++;
            return true;

        }

        return false;
    }


}
