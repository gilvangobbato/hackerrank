package com.mycompany.solutions;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class Exemples {

    public static void main(String[] args) {
        System.out.println(LocalDateTime.now().minusMonths(5).toInstant(ZoneOffset.UTC).toEpochMilli());
    }

}