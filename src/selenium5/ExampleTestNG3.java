package selenium5;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExampleTestNG3 {

    @Test(groups = { "groupA" })
    public void test1(){

        System.out.println("group A-Test 1");

    }

    @Test(groups = { "groupA" })
    public void test2(){
        System.out.println("group A-Test 2");
        Assert.fail();

    }

    @Test(groups = { "groupA","groupB" })
    public void testBothGroup(){
        System.out.println("group A-Test Both");

    }

    @Test(groups = { "groupB" })
    public void  test3(){
        System.out.println("group B-Test 3");
    }

    @Test(dependsOnMethods = { "test3" })
    public void  testDependsonMethods(){
        System.out.println("group B-Test DependsOn Method");
    }

    @Test(dependsOnGroups = { "groupA" })
    public void  testDependsOnGroups(){
        System.out.println("group B-Test DependsOn Group");
    }




}
