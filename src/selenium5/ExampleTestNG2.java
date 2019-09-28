package selenium5;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExampleTestNG2 {

    @BeforeTest
    public void test0(){

        System.out.println("Before test class 2");
    }

    @BeforeMethod()
    public void beforeMethod()
    {
        System.out.println("Before Method Class2");
    }

    @Test(priority = 1)
    public void test1(){

        System.out.println("This is Class-2 Test 1 method");
    }

    @Test(priority = 0)
    public void test2(){
        System.out.println("This is Class-2 test 2 method");
    }

    @Test(priority = 3)
    public void test3(){

        System.out.println("This is Class-2 test 3 method");
    }

    @AfterTest
    public void testn(){

        System.out.println("After test -class 2");
    }


}
