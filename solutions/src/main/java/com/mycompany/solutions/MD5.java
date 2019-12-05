package com.mycompany.solutions;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/**
 *
 * @author gilvan
 */
public class MD5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        if (password == null || password.isEmpty()) {
            System.exit(0);
        }
        password = password.replaceAll("[^a-zA-Z0-9]", "");
        if (password.length() < 6 || password.length() > 20) {
            System.exit(0);
        }
        try {
            MessageDigest algoritmo = MessageDigest.getInstance("MD5");
            algoritmo.update(password.getBytes());

            password = new BigInteger(1, algoritmo.digest()).toString(16);
            System.out.println(password);
        } catch (NoSuchAlgorithmException e) {
            System.out.println(e);
        }
        System.exit(0);

    }
}
