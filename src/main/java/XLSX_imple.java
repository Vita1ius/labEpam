import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class XLSX_imple implements listFromXLSX{
    @Override
    public List<SuperCar> getlist() {
        File myFile = new File("src/main/resources/file.xlsx");
        FileInputStream fis = null;
        List<SuperCar> cars = new LinkedList<>();

        XSSFWorkbook myWorkBook = null;
        try {
            fis = new FileInputStream(myFile);
            myWorkBook = new XSSFWorkbook(fis);
            XSSFSheet mySheet = myWorkBook.getSheetAt(0);
            // Get iterator to all the rows in current sheet
            // Traversing over each row of XLSX file
            for (Row row : mySheet) {
                cars.add(new SuperCar(row.getCell(0).toString(), (int) row.getCell(1).getNumericCellValue(), (int) row.getCell(2).getNumericCellValue()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cars;

    }
}
