package com.enotes_batch.document;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;;
public class App 
{
	static int end;
    public static void main( String[] args ) throws Exception
    {
    	 BufferedReader br = new BufferedReader(new FileReader("input.txt"));
    	 String st;
    	 
    	  while ((st = br.readLine()) != null) 
    	  {
    		 List<String> firstList=new ArrayList<String>();
    		  Scanner sc=new Scanner(st);
    		  sc.useDelimiter("-->");
    		  while(sc.hasNext())
    		  firstList.add(sc.next());
    		  Pattern p=Pattern.compile("<--");
    	    	for(int i=0;i<firstList.size();i++)
    	    	{
    	    		if(firstList.get(i).charAt(0)=='#')
    	    			System.out.println(firstList.get(i));
    	    	Matcher m=p.matcher(firstList.get(i));
    	    	while(m.find())
    	    		System.out.println(firstList.get(i).substring(0, m.start()));
    	    	}
    	  }
}
   
}
