package seleniumClass5;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass3 {

    @Test(groups = {"smokeTest"})
    public void test2(){

        System.out.println("This is smoke -test2");
    }

    @Test(groups = {"smokeTest"})
    public void test3(){

        System.out.println("This is smoke -test3");
    }

    @Test(groups = {"smokeTest"})
    public void test4(){

        System.out.println("This is smoke --test1");
    }

    @Test(groups = {"regressionTest","smokeTest"})
    public void test5(){

        System.out.println("This is regressionTest-test5");
    }

    @Test(groups = {"regressionTest"})
    public void test6(){

        System.out.println("This is regressionTest-test6");
        Assert.fail();
    }

    @Test(dependsOnGroups = {"regressionTest"})
    public void test7(){
        System.out.println("This is dependent method");
    }






}
