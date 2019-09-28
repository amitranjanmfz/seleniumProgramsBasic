package seleniumClass5;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass1 {

    @BeforeTest
    public void testBefore(){

        System.out.println("This is run before test");

    }


    @BeforeMethod
    public void testBeforeMethod(){

        System.out.println("This will run before each method of the class");
    }

    @Test(priority = 1)
    public void test1(){

        System.out.println("This is test1 method");

    }


    @Test(priority = 0)
    public void test2(){

        System.out.println("This is test2 method");
    }

    @Test(priority = 2)
    public void test3(){

        System.out.println("This is test3 method");
    }



}
