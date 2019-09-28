package dataProviderExamples;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class TestUtitlity {


    @Test
    public void readData() throws IOException {

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
                data[i][j]=row.getCell(j);
            }
        }

        System.out.println(data[2][2]);
    }


}
