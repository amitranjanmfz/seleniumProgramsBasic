package SeleniumBatchFeb;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestAssertion2 {


    @Test
    public void testAssert(){


        System.out.println("This is pre condition");
        SoftAssert assert1=new SoftAssert();
        assert1.assertEquals(10,20);
        System.out.println("This is postCondition");
        assert1.assertAll();



    }



}
