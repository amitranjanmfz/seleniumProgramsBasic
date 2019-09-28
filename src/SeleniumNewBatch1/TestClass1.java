package SeleniumNewBatch1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass1 {



    @BeforeTest

    public void test2(){

        System.out.println("This is test2-before Test method");
    }


    @Test(priority = 2)
    public void test1(){

        System.out.println("this is test 1 -class 1 method");


    }

    @Test(priority = 1)
    public void test3(){

        System.out.println("this is test 3 -class 1 method");


    }

    @BeforeMethod
    public void test4(){

        System.out.println("before method");


    }

    @AfterMethod
    public void test5(){

        System.out.println("after method");


    }






}

