package com.endpoint.ws;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.endpoint.bean.ErrorException;
import com.endpoint.service.UserData;
import com.endpoint.util.Constants;
import com.endpoint.util.MyProperties;

/**
 * Web Service Client
 * */
public class MyClient {

	/**
	 * Client runner
	 * */
	public static void main(String[] args) throws Exception {

		// WSDL connection (published by MyPublisher) 
		URL url = new URL("http://localhost:9999/ws/endpoint?wsdl");

		// Connects to service URI related to wsdl and Service Implementation
		QName qname = new QName("http://service.endpoint.com/", "UserDataImplService");
		Service service = Service.create(url, qname);
		UserData data = service.getPort(UserData.class);

		// Prints returned information
		if (args.length != 2){
			throw new ErrorException(new MyProperties().getProperty(Constants.MSG_ERROR_INVALID));
		}else{
			System.out.println(data.getUserCity(args[0], args[1]));
		}

	}

}