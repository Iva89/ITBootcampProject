package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RegistrationData {

	private static XSSFWorkbook wb;
	private static XSSFSheet sheet;
	private static FileInputStream fi;

	public static void findExcelSheet() {
		try {
			fi = new FileInputStream("test_data\\Registration.xlsx");
			wb = new XSSFWorkbook(fi);
			sheet = wb.getSheetAt(0);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getFirstName(int i) {
		Row row = sheet.getRow(i);
		Cell cell = row.getCell(0);
		return cell.getStringCellValue();
	}

	public static String getLastName(int i) {
		Row row = sheet.getRow(i);
		Cell cell = row.getCell(1);
		return cell.getStringCellValue();
	}

	public static String getEMail(int i) {
		Row row = sheet.getRow(i);
		Cell cell = row.getCell(2);
		return cell.getStringCellValue();
	}

	public static String getPassword(int i) {
		Row row = sheet.getRow(i);
		Cell cell = row.getCell(3);
		return cell.getStringCellValue();
	}

	public static String getAddress(int i) {
		Row row = sheet.getRow(i);
		Cell cell = row.getCell(4);
		return cell.getStringCellValue();
	}

	public static String getCity(int i) {
		Row row = sheet.getRow(i);
		Cell cell = row.getCell(5);
		return cell.getStringCellValue();
	}

	public static String getState(int i) {
		Row row = sheet.getRow(i);
		Cell cell = row.getCell(6);
		return cell.getStringCellValue();
	}

	public static String getPostalCode(int i) {
		DataFormatter formatter = new DataFormatter(); //creating formatter using the default locale
		Cell cell = sheet.getRow(i).getCell(7);
		String postalCode = formatter.formatCellValue(cell); //Returns the formatted value of a cell as a String regardless of the cell type
		return postalCode;
	}

	public static String getCountry(int i) {
		Row row = sheet.getRow(i);
		Cell cell = row.getCell(8);
		return cell.getStringCellValue();
	}

	public static String getMobilePhone(int i) {
		DataFormatter formatter = new DataFormatter(); 
		Cell cell = sheet.getRow(i).getCell(9);
		String mobilePhone = formatter.formatCellValue(cell);
		return mobilePhone;
	}
	
	public static int getRowNumber() {
		try {
			return sheet.getLastRowNum() + 1;
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Error.");
			return -1;
		}
	}
	
	public static void closeFi() {
		try {
			fi.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
