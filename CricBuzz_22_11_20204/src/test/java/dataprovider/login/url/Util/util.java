package dataprovider.login.url.Util;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.IOException;

public class util {

    public static Object[][] getExcelData(String filePath) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(filePath);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);

        DataFormatter formatter = new DataFormatter();

        int rowCount = sheet.getPhysicalNumberOfRows();
        XSSFRow row = sheet.getRow(0);
        int colCount = row.getLastCellNum();

        Object[][] data = new Object[rowCount-1][colCount];

        for(int i=0;i<rowCount-1;i++){
            row = sheet.getRow(i+1);
            for(int j=0;j<colCount;j++){
                XSSFCell cell = row.getCell(j);
                data[i][j]= formatter.formatCellValue(cell);
            }
        }
        return data;
    }
}
