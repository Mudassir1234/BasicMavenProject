package ExamplesPackage;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Readfile {
    public static void main(String[] args) throws IOException {
        File Myfile=new File("/Users/ghulammudassir/IdeaProjects/BasicMavenProject/Screenshot/test.xls");
        FileInputStream FL=new FileInputStream(Myfile);
        HSSFWorkbook myworkbook= new HSSFWorkbook(FL);
        HSSFSheet Mysheet= myworkbook.getSheetAt(0);
        String value= Mysheet.getRow(0).getCell(1).getStringCellValue();
        System.out.println(value);

    }
}
