package config;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

import dao.DAO;

public class HashPassword {
	
	public String hashPassword(String password) throws NoSuchAlgorithmException{
		String hashpass = "";
		String plainText = password;
		MessageDigest mdAlgorithm = MessageDigest.getInstance("MD5");
		mdAlgorithm.update(plainText.getBytes());
		
		byte[] digest = mdAlgorithm.digest();
		StringBuffer hexString = new StringBuffer();
		
		for(int i = 0; i < digest.length; i++) {
			plainText = Integer.toHexString(0xFF & digest[i]);
			
			if (plainText.length() < 2) {
				plainText = "0" + plainText;
			}
			hexString.append(plainText);
		}
		hashpass = hexString.toString();
		
		return hashpass;

	}
}
