package com.mycompany.solutions;

import java.io.*;
import static java.lang.System.in;
import java.lang.reflect.*;
import java.math.BigInteger;
import java.util.*;

public class PrimeChecker {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            int n1 = Integer.parseInt(br.readLine());
            int n2 = Integer.parseInt(br.readLine());
            int n3 = Integer.parseInt(br.readLine());
            int n4 = Integer.parseInt(br.readLine());
            int n5 = Integer.parseInt(br.readLine());
            Prime ob = new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1, n2);
            ob.checkPrime(n1, n2, n3);
            ob.checkPrime(n1, n2, n3, n4, n5);
            Method[] methods = Prime.class.getDeclaredMethods();
            Set<String> set = new HashSet<>();
            boolean overload = false;
            for (Method method : methods) {
                if (set.contains(method.getName())) {
                    overload = true;
                    break;
                }
                set.add(method.getName());
            }
            if (overload) {
                throw new Exception("Overloading not allowed");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

class Prime {

    public void checkPrime(int... numbers) {
        String print = "";
        for (int number : numbers) {
            BigInteger bi = BigInteger.valueOf(number);
            if (bi.isProbablePrime(number)) {
                if (print.isEmpty()) {
                    print += number;
                } else {
                    print += ", " + number;
                }
            }
        }
        System.out.println(print);
    }
}
