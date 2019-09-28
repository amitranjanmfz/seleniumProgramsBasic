package SeleniumBatchFeb;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestClass1 {

   @BeforeClass
   public void display1(){

       System.out.println("This is display1 method--before class");
   }
    @BeforeMethod
    public void display4(){

        System.out.println("This is display1 method--before method");
    }

    @AfterMethod
    public void display5(){

        System.out.println("This is display5 method--after method");
    }
   @Test(priority = 2)
    public void display2(){

        System.out.println("This is display2 method--test class");
    }
    @Test(priority = 1)
    public void display6(){

        System.out.println("This is display6 method--test class2");
        //Assert.fail();
    }
    @Test(enabled = false)
    public void display8(){

        System.out.println("This is display8 method--test class2");
        //Assert.fail();
    }

    @Test(dependsOnMethods = "display6")
    public void display7(){

        System.out.println("This is dependent method");
    }


    @AfterClass
    public void display3(){

        System.out.println("This is display3 method--after class");
    }

    @BeforeSuite
    public void beforeSuiteMethod(){

        System.out.println("Before suite method");
    }

    @AfterSuite
    public void afterSuiteMethod(){

        System.out.println("After suite method");
    }





}
