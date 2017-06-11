package com.sharma.nk.validators;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class BaseRequestValidation {

	public boolean isValidEmail(String inputEmail){
		String regexEmail = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$";
		Pattern emailPattern = Pattern.compile(regexEmail);
		Matcher matcher = emailPattern.matcher(inputEmail.trim());
		return matcher.find();
	}
	
	public boolean isValidInputString(String inputString){
		String regexString="[a-zA-Z0-9]";
		Pattern stringPattern=Pattern.compile(regexString);
		Matcher matcher=stringPattern.matcher(inputString.trim());
		return matcher.find();
	}
	
	public boolean isWhitespaceInputString(String whiteSpaceString){
		String regexString="\\s";
		Pattern stringPattern=Pattern.compile(regexString);
		Matcher matcher=stringPattern.matcher(whiteSpaceString.trim());
		 
		return !matcher.find();
	}

	public boolean isValidDate(String inputDate){
		String dateFormat="dd-MM-yyyy";
		
		try {
			new SimpleDateFormat(dateFormat).parse(inputDate);
			return true;
		} catch (ParseException e) {return false;}	
	}
}
