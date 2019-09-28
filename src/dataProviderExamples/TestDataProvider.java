package dataProviderExamples;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider {


    @DataProvider(name = "driveTest")
    public Object[][] getData(){

        Object[][] data={{"hello","text",1},{"bye","message",143},{"solo","call",145}};
        return data;

    }


    @Test(dataProvider = "driveTest")
    public void readData(String a,String b,int c){

        System.out.println(a+b+c);


    }


}
