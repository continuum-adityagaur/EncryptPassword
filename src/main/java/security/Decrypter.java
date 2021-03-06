package main.java.security;

import org.apache.commons.codec.binary.Base64;


import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Decrypter {


	 public static String decrypt( String encrypted) {
	        try {
	            IvParameterSpec iv = new IvParameterSpec(SecurityConstants.initVector.getBytes("UTF-8"));
	            SecretKeySpec skeySpec = new SecretKeySpec(SecurityConstants.key.getBytes("UTF-8"), "AES");
	            
	            
	            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
	            cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);

	            byte[] original = cipher.doFinal(Base64.decodeBase64(encrypted));

	            return new String(original);
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }

	        return null;
	    }

}
