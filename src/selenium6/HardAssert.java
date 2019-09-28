package selenium6;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {

    @Test
    public void test1(){

        Assert.assertEquals("DEF","DEF");
        System.out.println("Assertion-test1");

    }


    @Test
    public void test2(){
        Assert.assertEquals("abc","ABC");
        System.out.println("Assertion-test2");

    }

}
