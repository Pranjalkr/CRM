package com.crm.qa.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config {

	private static Properties readProperties;
	
	static
	{
		
		String path = System.getProperty("user.dir") + "\\Config.properties";
		//String path="E:\\learning\\CRM\\com.crm\\Config.properties";
		try {
			FileInputStream fileName= new FileInputStream(path);
			readProperties= new Properties();
			readProperties.load(fileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		public static String getProperty(String key)
		{
			return readProperties.getProperty(key);
		}
	
}
