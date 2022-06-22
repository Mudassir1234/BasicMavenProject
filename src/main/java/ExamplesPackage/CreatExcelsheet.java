package ExamplesPackage;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.IOException;

public class CreatExcelsheet {
    public static void main(String[] args) throws IOException {
        HSSFWorkbook workbook=new HSSFWorkbook();
        HSSFSheet Excelsheet= workbook.createSheet();
        Excelsheet.createRow(0);
        Excelsheet.getRow(0).createCell(0).setCellValue("Hello");
        Excelsheet.getRow(0).createCell(1).setCellValue("World");
        Excelsheet.createRow(1);
        Excelsheet.getRow(1).createCell(0).setCellValue("Ghulam");
        Excelsheet.getRow(1).createCell(1).setCellValue("Mudassir");
        File myfile= new File("/Users/ghulammudassir/IdeaProjects/BasicMavenProject/Screenshot/test.xls");
        workbook.write(myfile);

    }
}
