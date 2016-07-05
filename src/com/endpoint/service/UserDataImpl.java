package com.endpoint.service;

import java.util.List;

import javax.jws.WebService;

import org.geonames.PostalCode;
import org.geonames.PostalCodeSearchCriteria;

import com.endpoint.bean.ErrorException;
import com.endpoint.bean.UserInfo;
import com.endpoint.util.Constants;
import com.endpoint.util.MyProperties;
import com.google.gson.Gson;


@WebService(endpointInterface = "com.endpoint.service.UserData")
public class UserDataImpl implements UserData {
	
	/**
	 * JSON Parser
	 * */
	private Gson gson = new Gson();

	/**
	 * Project properties
	 * */
	MyProperties prop = null;

	@Override
	public String getUserCity(String username, String postalCode) {
		UserInfo userInfo = new UserInfo(username, postalCode);
		
		try {
			prop = new MyProperties();
			
			// Check received information
			if (!userInfo.validInitInfo()){				
				return gson.toJson(new ErrorException(prop.getProperty(Constants.MSG_ERROR_INVALID)));
			}

			// Set Username for Geonames.org service
			org.geonames.WebService.setUserName(prop.getProperty(Constants.PROP_GEO_USER)); 

			// Set PostalCode Filter
			PostalCodeSearchCriteria searchCriteria = new PostalCodeSearchCriteria();
			searchCriteria.setPostalCode(userInfo.getPostalCode());
			searchCriteria.setMaxRows(1);
			// Geonames.org Request
			List<PostalCode> searchResult = org.geonames.WebService.postalCodeSearch(searchCriteria);
			// Get match and save user data
			if (searchResult.size() > 0) {
				userInfo.setCity(searchResult.get(0).getPlaceName());
			}else{
				return gson.toJson(new ErrorException(prop.getProperty(Constants.MSG_ERROR_NOINFO)));
			}
			return gson.toJson(userInfo);
		} catch (ErrorException e) {
			System.out.println(e);
			return gson.toJson(e);
		}catch (Exception e) {
			System.out.println(e);
			return gson.toJson(new ErrorException(e));
		}
			
		
		
	}
}
