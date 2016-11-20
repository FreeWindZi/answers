package com.navy;



import java.io.File;
import java.io.IOException;
import java.text.Format;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class TestJxl {

	public static final String file_path = "D:\\workspace\\eclipse1\\TestJxlLibrary\\document\\NETEM_Template1.xls";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File(file_path);
		try {
			Workbook workbook = Workbook.getWorkbook(file);
			Sheet sheet =  workbook.getSheet(0);
			int rows = sheet.getRows();
			System.out.println("行数为 "+ rows);
			int cols = sheet.getColumns();
			System.out.println("列数为 "+ cols);
			
			Cell cell =  sheet.getCell(2, 0);
			System.out.println(cell.getContents());
		} catch (BiffException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
