package SeleniumNewBatch1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass2 {

    @Test
    public void testClass2(){

        System.out.println("This is testclass2-class2 method");

    }


    @Test
    public void testClass3(){

        System.out.println("This is testclass3-class2 method");

    }

    @BeforeMethod
    public void testClass4(){

        System.out.println("Before method-class2     ");

    }



}
