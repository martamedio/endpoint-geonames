package com.endpoint.ws;
 
import javax.xml.ws.Endpoint;

import com.endpoint.service.UserDataImpl;

/**
 * Endpoint publisher
 * */
public class MyPublisher{
 
	/**
	 * Publish the webservice endpoint implementation to consume it
	 * */
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:9999/ws/endpoint", new UserDataImpl());
	   System.out.println("Running: http://localhost:9999/ws/endpoint");
    }
 
}