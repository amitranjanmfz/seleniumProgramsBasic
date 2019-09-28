package dataProviderExamples;

import org.apache.poi.sl.usermodel.ObjectData;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class TestDataProviderExcel {

    DataFormatter df=new DataFormatter();

    @Test(dataProvider = "driveTest")
    public void readData(String a,String b,String c){
        System.out.println(a+b+c);
    }

    @DataProvider(name = "driveTest")
    public Object[][] getData() throws IOException {
        FileInputStream fis=new FileInputStream("C:\\Users\\amiranja3\\Desktop\\amazon\\dataProviderSheet.xlsx");
        XSSFWorkbook wb=new XSSFWorkbook(fis);
        XSSFSheet sh=wb.getSheetAt(0);
        int rowCount=sh.getPhysicalNumberOfRows();
        XSSFRow row=sh.getRow(0);
        int colCount=row.getLastCellNum();
        Object data[][]=new Object[rowCount-1][colCount];
        for(int i=0;i<rowCount-1;i++){
            row=sh.getRow(i+1);
            for(int j=0;j<colCount;j++){
                XSSFCell cell =row.getCell(j);
                data[i][j]=df.formatCellValue(cell);// format value retrieved from excel into String data type
            }
        }
        return data;
    }


}
