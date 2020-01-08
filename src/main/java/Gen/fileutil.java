package Gen;

 
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
 
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

 
      public class fileutil {		
		 String filepath="./Data/commondata.properties";
		 String excelpath="./Data/testdata.xlsx";
	 
		 public Properties getpropertiesfileobject() throws IOException
		 {
			 FileInputStream fis=new FileInputStream(filepath);
			 Properties pobj=new Properties();
			 pobj.load(fis);
			 
			 return pobj;
		 }
		 public String getexcelData(String sheetname,int rownum,int celnum) throws Throwable   
		 {		 
			 FileInputStream fis=new FileInputStream(excelpath);
				Workbook read= new XSSFWorkbook(fis);
				Sheet sh=read.getSheet(sheetname);
				String data=sh.getRow(rownum).getCell(celnum).getStringCellValue();			 			 
			 return data;  		
		 }
//		 public String getexcelRandomData(String sheetname,int rownum,int celnum) throws Throwable   
//		 {		 
//			 FileInputStream fis=new FileInputStream(excelpath);
//				Workbook we= new XSSFWorkbook(fis);
//				Sheet sh=we.getSheet(sheetname);
//				Random num=new Random();
//				int a= num(sh.getLastRowNum());
//				Row row=sh.getRow(a);
//				
				//String data=sh.getRow(rownum).getCell(celnum).getStringCellValue();			 			 
			 //return data;  		
		// }
		 public String WritesetexcelData(String sheetname,int rownum,int celnum,String data) throws Throwable   
		 {
			 FileInputStream fis=new FileInputStream(excelpath);
			  Workbook setwb=new XSSFWorkbook(fis);  
  			  Sheet shh=setwb.createSheet(sheetname);
 			        shh.createRow(rownum).createCell(celnum).setCellValue(data);  
		     FileOutputStream pos=new FileOutputStream(excelpath);
			        setwb.write(pos);
 			 return data;
		 }
		 public String setexcelData(String sheetname,int rownum,int celnum,String data) throws Throwable   
		 {
			 FileInputStream fis=new FileInputStream(excelpath);
			  Workbook setwb=new XSSFWorkbook(fis);
			  
//			  if(!setwb.equals(sheetname)) {
// 			       Sheet shh=setwb.createSheet(sheetname);
// 			             shh.createRow(rownum).createCell(celnum).setCellValue(data);  }
//			  }else(setwb.equals(sheetname))
//			  {
//				  if(setwb.equals(sheetname)) {
			  
  				  Sheet sh=setwb.getSheet(sheetname);
				  sh.createRow(rownum).createCell(celnum).setCellValue(data);
//            }
//            }
		     FileOutputStream pos=new FileOutputStream(excelpath);
				  setwb.write(pos);
 			 return data;
		 }
}
