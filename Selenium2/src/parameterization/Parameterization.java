package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Parameterization {
	
	public void param() throws EncryptedDocumentException, IOException {
		
		String path = "E:\\Velocity\\Test Data.xlsx";
		FileInputStream f = new FileInputStream(path);
		
		String val= WorkbookFactory.create(f).getSheet("Sheet1").getRow(0).
				getCell(0).getStringCellValue();
		System.out.println(val);
		
// to fetch the test data from excel sheet to eclipse or selenium	
//For that 	, first we have to create object of the  FileInputStream class and while creating 
// object we have to pass the path of the excel sheet file as argument in constructor of the 
//FileInputStream class.
// After that craeate method from WorkbookFactory class pass the FileINputStream object as argument
//in method and then getSheet() method in which we have to pass Sheet no in String format from file 
//from which we want to fetch the data then getRow(),getCell(),getStringCellValue().
		
		
		String path1 = "E:\\Velocity\\Test Data.xlsx";
		FileInputStream b = new FileInputStream(path1);
		
		String val2 = WorkbookFactory.create(b).getSheet("Sheet1").
		getRow(1).getCell(2).getStringCellValue();
		System.out.println(val2);
		
		FileInputStream v = new FileInputStream(path1);
		Workbook x = WorkbookFactory.create(v);
		int i,j;
		
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				String val3 = x.getSheet("Sheet1").getRow(i)
				.getCell(j).getStringCellValue();
				System.out.print(val3 + " ");
			}
			System.out.println();
		}
		
		
		
		System.out.println();
		int a,d;
		d=0;
		while(d<3) {
		for(a=0;a<3;a++) {
			String val5  = x.getSheet("Sheet1").getRow(a).getCell(d).getStringCellValue();
			System.out.print(val5 +" ");
		}
		System.out.println();
		d++;
		}
		}
	
	public void  param2() throws EncryptedDocumentException, IOException {
		
		String s1 = "E:\\Velocity\\Test Data.xlsx";
		
		FileInputStream f1 = new FileInputStream(s1);
		
		String s2 = WorkbookFactory.create(f1).getSheet("Sheet2").
		getRow(9).getCell(2).getStringCellValue();
		System.out.println(s2);
		
		}
	
	public void retrieve() throws IOException {
		
		int[] a = new int[5];
		
		for(int i=0;i<a.length;i++) {
			a[i]=i+1;
		}
		
		String[] name = new String[5];
		
	    name[0]="SA";
	    name[1]="SB";
	    name[2]="SC";
	    name[3]="SD";
	    name[4]="SE";

	    String[] result = new String[5];
	    
	    result[0]="pass";
	    result[1]="pass";
	    result[2]="fail";
	    result[3]="pass";
	    result[4]="fail";
	    
	    XSSFWorkbook wb = new XSSFWorkbook();
	    
	    XSSFSheet sheet = wb.createSheet("baba");
	    
	    XSSFRow row = sheet.createRow(0);
	    
	   Cell cel0 = row.createCell(0);
	  Cell cel1 = row.createCell(1);
	    Cell cel2 = row.createCell(2);	    
	    
	    for(int i=0;i<a.length;i++) {
	    	row = sheet.createRow(i+1);
	    	
	    	for(int j=0;j<3;j++) {
	    		Cell cell= row.createCell(j);
	    		
	    		if(cell.getColumnIndex()==0) {
	    		cell.setCellValue(a[i]);
	    	}else if(cell.getColumnIndex()==1) {
	    		cell.setCellValue(name[i]);
	    	}else if(cell.getColumnIndex()==2) {
	    		cell.setCellValue(result[i]);
	    	}
	    }}
	    System.out.println(wb);
	    	String path1 = "E:\\Velocity\\parameterization\\Pract_1.xlsx";
	    	
	    	FileOutputStream o = new FileOutputStream(path1);
	    	wb.write(o);
	    	System.out.println("file generated");
	    	o.close();
	    	
	    	 }
	
	public void retrieve2() throws IOException {
		
		int[] a = new int[5];
		
		for(int i=0;i<a.length;i++) {
			a[i]=i+1;
		}
		
		
       String[] name = new String[5];
       name[0]="Akshay";
       name[1]="Mayur";
       name[2]="Kiran";
       name[3]="Nikhil";
       name[4]="Manoj";
       
       int[] salary = new int[5];
       
       salary[0]= 100000;
       salary[1]= 200000;
       salary[2]= 300000;
       salary[3]= 400000;
       salary[4]= 500000;
		
		XSSFWorkbook wb = new XSSFWorkbook();
		
		XSSFSheet sheet = wb.createSheet("hawa");

		for(int i=0;i<a.length;i++) {
			XSSFRow row= sheet.createRow(i);
			for(int j=0;j<3;j++) {
				Cell cell = row.createCell(j);
				if(cell.getColumnIndex()==0) {
					cell.setCellValue(a[i]);
				}else if(cell.getColumnIndex()==1) {
					cell.setCellValue(name[i]);
				}else if(cell.getColumnIndex()==2) {
					cell.setCellValue(salary[i]);
				}
				}
		}
		String pat = "E:\\Velocity\\parameterization\\EmpSalry.xlsx";
		FileOutputStream c = new FileOutputStream(pat);
		wb.write(c);
		c.close();
		
			
			
			
			
			
			
			
			
			
			
			
			
			
	}
	
}
	
	
	
	

