package com.chainsys.vehiclemanagement;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
	public static boolean checkNameContainsOnlyString(String data) throws InvalidInputDataException {
		boolean result = false;
		for (int i = 0; i < data.length(); i++) {
			if (data.charAt(i) >= '0' && data.charAt(i) <= '9') {
				throw new InvalidInputDataException("Please enter the name only with alphabets");
			}
		}
		return result;
	}
	public static void checkPhone(String data) throws InvalidInputDataException {
		boolean result = false;
		String pattern = "^[0-9]{10}$";
		Pattern patt = Pattern.compile(pattern);
		Matcher match = patt.matcher(data);
		result = match.matches();
		if (!result)
			throw new InvalidInputDataException("Please enter 10 digits ");
	}
}
