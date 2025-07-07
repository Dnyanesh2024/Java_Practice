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


public class ExcelWritter {

	public String path;
	public FileInputStream fis = null;
	public FileOutputStream fileOut = null;
	private XSSFWorkbook workbook = null;
	
	private static XSSFSheet sheet = null;
	//private XSSFRow row = null;
	private XSSFCell cell = null;
	DataFormatter df = new DataFormatter();

	public ExcelWritter(String path, int index) throws Exception {
		this.path = path;
		try {
			fis = new FileInputStream(path);
			//fileOut = new FileOutputStream(path);
			workbook = new XSSFWorkbook(fis);
			
			fileOut = new FileOutputStream(path);
			
			sheet = workbook.getSheetAt(index);
			

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	 public void writeExcelData(int row1, int col1, String value) throws IOException { 
	 //fileOut = new FileOutputStream(path);
	// workbook =  new XSSFWorkbook(fis); 
	 //sheet = workbook.getSheetAt(index); 
	 cell =sheet.getRow(row1).getCell(col1); 
	 cell.setCellType(CellType.STRING);
	  cell.setCellValue(value);
	  
	  workbook.write(fileOut); 
	  fileOut.flush(); 
	  workbook.close();
	  System.out.println("write data in already created sheet, row and column"); }
	 
	 public void writeExcelData_CreateRow_createcell(int row1, int col1, String value) throws IOException { 
		 //fileOut = new FileOutputStream(path);
		// workbook =  new XSSFWorkbook(fis); 
		 //sheet = workbook.getSheetAt(index); 
		 cell =sheet.createRow(row1).createCell(col1); 
		 cell.setCellType(CellType.STRING);
		  cell.setCellValue(value);
		  
		  workbook.write(fileOut); 
		  fileOut.flush(); 
		  workbook.close();
		  System.out.println("Created new row in old sheet"); }
	 
	 public void writeExcelData_createCell(int row1, int col1, String value) throws IOException { 
		 //fileOut = new FileOutputStream(path);
		// workbook =  new XSSFWorkbook(fis); 
		 //sheet = workbook.getSheetAt(index); 
		 cell =sheet.getRow(row1).createCell(col1); 
		 cell.setCellType(CellType.STRING);
		  cell.setCellValue(value);
		  
		  workbook.write(fileOut); 
		  fileOut.flush(); 
		  workbook.close();
		  System.out.println("Created new column in old row"); }
	 
	 public void writeExcelData_createSheet(String sheetName, int row1, int col1, String value) throws IOException { 
		 //fileOut = new FileOutputStream(path);
		// workbook =  new XSSFWorkbook(fis); 
		 sheet = workbook.createSheet(sheetName);
		 cell =sheet.createRow(row1).createCell(col1); 
		 cell.setCellType(CellType.STRING);
		  cell.setCellValue(value);
		  
		  workbook.write(fileOut); 
		  fileOut.flush(); 
		  workbook.close();
		  System.out.println("Created New sheet, row and column"); }
		 
		 
		 
	 
	 

}
