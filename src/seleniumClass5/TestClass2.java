package seleniumClass5;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestClass2 {

    @Test(priority = 1)
    public void test1(){

        System.out.println("This is Class2-test1 method");

    }


    @Test(enabled = false)
    public void test2(){

        System.out.println("This is Class2- test2 method");
    }

    @Test(priority = 2)
    public void test3(){

        System.out.println("This is Class2- test3 method");
    }


    @AfterTest
    public void testAfter(){
        System.out.println("This will run after test");
    }


}
