package com.endpoint.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

/**
 * Service Endpoint Interface
 * */
@WebService
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL)
public interface UserData {

	/**
	 * Given a username and a postalCode, returns city info (JSON)
	 * @param username String
	 * @param postalCode String
	 * @return String JSON 
	 * */
	@WebMethod
	String getUserCity(String username, String postalCode);

}