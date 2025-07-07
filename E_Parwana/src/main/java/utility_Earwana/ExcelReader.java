package utility_Earwana;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class ExcelReader {

	public String path;
	public FileInputStream fis = null;
	public FileOutputStream fileOut = null;
	private XSSFWorkbook workbook = null;
	public static int rowCount = 0;
	
	private static XSSFSheet sheet = null;
	//private XSSFRow row = null;
	private XSSFCell cell = null;
	DataFormatter df = new DataFormatter();

	public ExcelReader(String path, int index) throws Exception {
		this.path = path;
		try {

			fis = new FileInputStream(path);
			//fileOut = new FileOutputStream(path);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheetAt(index);
			rowCount= sheet.getPhysicalNumberOfRows(); // Calculating no of rows in given excel.
			//System.out.println("No of rows in sheet:-> " + rowCount);
			//fis.close();

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Test
	public String getExcelData(int row1, int col1)  {
		String returnVal = df.formatCellValue(sheet.getRow(row1).getCell(col1));
		try {
			fis.close();
			workbook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return returnVal;

	}

	
	
}
