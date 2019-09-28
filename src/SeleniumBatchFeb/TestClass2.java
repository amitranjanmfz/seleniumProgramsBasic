package SeleniumBatchFeb;

import org.testng.annotations.*;

public class TestClass2 {


    @BeforeSuite
    public void beforeSuiteMethod(){

        System.out.println("Before suite method");
    }

    @AfterSuite
    public void afterSuiteMethod(){

        System.out.println("After suite method");
    }

    @BeforeClass
    public void display1(){

        System.out.println("Class-2-This is display1 method--before class");

    }
    @BeforeMethod
    public void display4(){

        System.out.println("Class-2-This is display1 method--before method");
    }

    @AfterMethod
    public void display5(){

        System.out.println("Class-2-This is display5 method--after method");
    }
    @Test(priority = 2)
    public void display2(){

        System.out.println("Class-2-This is display2 method--test class");
    }
    @Test(priority = 1)
    public void display6(){

        System.out.println("Class-2-This is display6 method--test class2");
    }
    @AfterClass
    public void display3(){

        System.out.println("Class-2-This is display3 method--after class");
    }



}
