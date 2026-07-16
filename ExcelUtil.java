import java.io.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

  
    public static void readExcel(String path) throws IOException {
        FileInputStream fis = new FileInputStream(path);
        Workbook wb = new XSSFWorkbook(fis);
        Sheet sheet = wb.getSheetAt(0);

        for (Row row : sheet) {
            for (Cell cell : row) {
                switch (cell.getCellType()) {
                    case STRING:  System.out.print(cell.getStringCellValue() + "\t"); break;
                    case NUMERIC: System.out.print(cell.getNumericCellValue() + "\t"); break;
                    case BOOLEAN: System.out.print(cell.getBooleanCellValue() + "\t"); break;
                    default:      System.out.print(" \t");
                }
            }
            System.out.println();
        }
        wb.close();
        fis.close();
    }


    public static void writeExcel(String path) throws IOException {
        Workbook wb = new XSSFWorkbook();
        Sheet sheet = wb.createSheet("Employees");

        String[][] data = {
            {"ID", "Name", "Role"},
            {"1", "Sindhuja", "Contractor"},
            {"2", "Ruchika",  "Contractor"}
        };

        for (int i = 0; i < data.length; i++) {
            Row row = sheet.createRow(i);
            for (int j = 0; j < data[i].length; j++) {
                row.createCell(j).setCellValue(data[i][j]);
            }
        }

        FileOutputStream fos = new FileOutputStream(path);
        wb.write(fos);
        wb.close();
        fos.close();
        System.out.println("Excel written successfully!");
    }

    public static void main(String[] args) throws IOException {
        writeExcel("TestData.xlsx");
        readExcel("TestData.xlsx");
    }
}