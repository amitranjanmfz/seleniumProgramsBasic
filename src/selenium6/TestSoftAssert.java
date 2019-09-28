package selenium6;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestSoftAssert {

    @Test
    public void test1(){
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals("abc","def");
        softAssert.assertEquals("ami","amit","amit string is not present");
        System.out.println("Soft assert-this line should be printed");
        softAssert.assertAll();

    }
}
