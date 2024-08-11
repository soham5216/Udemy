package udemy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;


public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//Read data from excel
		FileInputStream fis=new FileInputStream(new File("C:\\Users\\589162\\eclipse-workspace\\TestProject\\src\\test\\resources\\testData\\TestData.xlsx"));
		
		  XSSFWorkbook wb=new XSSFWorkbook(fis); 
		  XSSFSheet sheet=wb.getSheetAt(0);
		  String value=sheet.getRow(0).getCell(0).getStringCellValue();
		  System.out.println(value);
		 
	//Write data to excel	  
		  sheet.getRow(1).getCell(1).setCellValue("SohamTest");
	
		  FileOutputStream fos = new FileOutputStream("C:\\Users\\589162\\eclipse-workspace\\TestProject\\src\\test\\resources\\testData\\TestData.xlsx");
		  wb.write(fos);
		  fos.close();
		
		
		
	}

}
