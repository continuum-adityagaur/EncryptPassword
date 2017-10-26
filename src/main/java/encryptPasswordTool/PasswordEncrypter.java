package main.java.encryptPasswordTool;


import java.util.Scanner;

import main.java.security.Encrypter;
import main.java.security.SecurityConstants;


public class PasswordEncrypter extends SecurityConstants {

    /*
        You just need to run this program and provide your input via console.
        ***Do not modify the program as this may impact other users***
    */
    public static void main(String[] args) {

        Scanner read=new Scanner(System.in);
        System.out.println("Enter your password here :");
        String PASSWORD=read.next();
        System.out.println("You have entered : "+ PASSWORD);

        System.out.println("Encrypting");
        String myEncryptedString= Encrypter.encrypt(key, initVector, PASSWORD);
        System.out.println(" Your Encrypted PASSWORD is : " +myEncryptedString);
        System.out.println(" Please paste this encrypted password accordingly.");
        System.out.println(" This will be decryted at runtime !");
    }

}
