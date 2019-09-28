package JavaPrograms;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProv1 {


    //@Test(dataProviderClass=DataPrv.class,dataProvider="uidpwd")  //if data provider is in different class
    //where DataPrv is class name

    @Test(dataProvider="uidpwd")
    public void login(String u, String p){
        System.out.println(u+"------"+p+"------");
    }


    @Test(dataProvider="getData")
    public void product(String s1, String s2, String s3){  //number of arguments will be same as number of columns in Data Provider
        System.out.println(s1+"------"+s2+"------"+s3);
    }



    @DataProvider
    public Object[][] uidpwd(){

        Object[][] data1=new Object[2][2];//2 rows and 2 columns
        data1[0][0]="abc";
        data1[0][1]="def";

        data1[1][0]="efg";
        data1[1][1]="hij";


        return data1;
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

