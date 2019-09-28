package selenium6;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProviders {

    @Test(dataProvider="getData")
    public void product(String s1, String s2, String s3)
    {
     //   System.out.println(s1+"------"+s2+"------"+s3);
        System.out.println(s1);
    }



    @DataProvider
    public Object[][] getData(){
        Object[][] data=new Object[2][3];//2 rows and 3 columns
        data[0][0]="data11";
        data[0][1]="data12";
        data[0][2]="data13";

        data[1][0]="data21";
        data[1][1]="data22";
        data[1][2]="data23";

        return data;
    }

}




