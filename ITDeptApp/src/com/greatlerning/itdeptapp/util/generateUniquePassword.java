package com.greatlerning.itdeptapp.util;

import java.util.Random;

public class generateUniquePassword {

	public static String generatePass(int length) {
		String validString = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$&0123456789";
		String generatedPassword = "";
		for (int i = 0; i < length; i++) {
			Random random = new Random();
			generatedPassword = generatedPassword + validString.charAt(random.nextInt(68));
		}
		return generatedPassword;
		
	}
}
