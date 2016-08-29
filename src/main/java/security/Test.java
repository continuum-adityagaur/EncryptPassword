package security;

/**
 * Created by Ashutosh Mishra on 6/10/2016.
 */
public class Test extends SecurityConstants {

    public static void main(String[] args) {

        System.out.println("Encrypting");
        String myEncryptedString=Encrypter.encrypt(key, initVector, "password");
        System.out.println(" myEncryptedString " +myEncryptedString);

        System.out.println("Decrypting");
        String afterDecrypting=Decrypter.decrypt(key, initVector, myEncryptedString);
        System.out.println(" afterDecrypting " +afterDecrypting);

    }
}
