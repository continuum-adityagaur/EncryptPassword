package main.java.security;

public class Test extends SecurityConstants {

    public static void main(String[] args) {

        System.out.println("Encrypting");
        String myEncryptedString=Encrypter.encrypt(key, initVector, "aUt0T3$t#958");
        System.out.println(" myEncryptedString " +myEncryptedString);

        System.out.println("Decrypting");
        String afterDecrypting=Decrypter.decrypt( myEncryptedString);
        System.out.println(" afterDecrypting " +afterDecrypting);

    }
}
