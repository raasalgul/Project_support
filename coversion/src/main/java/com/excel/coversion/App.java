package com.excel.coversion;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * Hello world!
 *
 */
public class App 
{
	final static String fileLocation="Z:\\Daily Track\\4-12-2019\\Template_variables.xlsx";
    public static void main( String[] args ) throws Exception
    {
    	
    	String query="INSERT INTO `comm_template_variables` (`TEMPLATE_VAR_ID`, `TEMPLATE_ID`, `DATASOURCE`, `TEMPLATE_VAR`, `TEMPLATE_VAR_DESCRIPTION`, `TEMPLATE_VAR_QUERY`, `TEMPLATE_QUERY_VARIABLE`, `IS_REQUIRED`, `TEMPLATE_VAR_MAPPING_ID`, `ADDED_DATE`, `ADDED_LOGON`, `REVISED_DATE`, `REVISED_LOGON`, `SEQUENCE_NO`) VALUES (";
    	Workbook workbook = new XSSFWorkbook(fileLocation);
    	Sheet sheet = workbook.getSheetAt(0);
    	Map<Integer, List<String>> data = new HashMap<>();
    	//int i = 127;
    	String write="";
    	for (int i=1;i<sheet.getLastRowNum();i++) {
    		Row row=sheet.getRow(i);
    		//	System.out.println(row.getCell(0).toString().replace(".0","")+"----------------");
    		//if(row.)
    			String result=row.getCell(5).toString().replaceFirst("as \""+row.getCell(3)+"\" ", "");
    			String temp=query+row.getCell(0).toString().replace(".0","")+","+row.getCell(1).toString().replace(".0","")+",'"+row.getCell(2)+"','"+row.getCell(3)+"','"+row.getCell(4)+"','"+result+"','"+row.getCell(6)+"','"+row.getCell(7).toString().replace(".0","")
    			+"',"+row.getCell(8).toString().replace(".0","")+",'"+row.getCell(9)+"','"+row.getCell(10)+"','"+row.getCell(11)+"','admin"+"',"+row.getCell(13).toString().replace(".0","")+");";
    			//System.out.println(temp);
    			write+=temp+"\n";
    		
 
    	}
    	String path="Z:\\Daily Track\\4-12-2019\\test.txt";
    	 Files.write(Paths.get(path), write.getBytes());
    	
        System.out.println(write);
    }
}
