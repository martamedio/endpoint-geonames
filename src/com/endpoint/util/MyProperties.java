package com.endpoint.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.endpoint.bean.ErrorException;

/**
 * Handler for project properties
 * */
public class MyProperties {
	
	/**
	 * Properties Handler
	 * */
	Properties prop = new Properties();
	
	/**
	 * Constructor, loads all the properties 
	 * */
	public MyProperties() throws ErrorException{
		try {
			// Load Properties from data.properties
			InputStream input = getClass().getClassLoader().getResourceAsStream("data.properties");
			prop.load(input);
			// Load Properties from messages.properties
			input = getClass().getClassLoader().getResourceAsStream("messages.properties");
			prop.load(input);
		} catch (IOException e) {
			throw new ErrorException(e);
		}
	}
	
	/**
	 * Returns the string from properties files
	 * @param String key
	 * @return String
	 * */
	public String getProperty(String key){
		return prop.getProperty(key);
	}

}
