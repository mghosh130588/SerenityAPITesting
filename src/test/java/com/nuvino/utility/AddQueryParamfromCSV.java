package com.nuvino.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import org.junit.Test;
import org.junit.runner.RunWith;

import net.serenitybdd.junit.runners.SerenityRunner;


public class AddQueryParamfromCSV {
	
	 //public static String uid;
	// public static String apikey;
	 public static ArrayList <String> ac;

	public static  ArrayList<String> getapikeysfromcsv() throws FileNotFoundException {
		
		
		 ArrayList <String> ac = new ArrayList <String>();

		Scanner sc =  new Scanner(new File("/Users/mousumighosh/Selenium/SerenityProj/src/test/resources/TestData/apikey.csv"));
		sc.useDelimiter(",");
	
		while (sc.hasNext())
		{
		
			ac.add(sc.next());
			
		}
		sc.close();
		return ac;	
		
	}
	
	
	
}
