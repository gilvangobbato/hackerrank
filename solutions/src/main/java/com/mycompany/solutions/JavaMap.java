package com.mycompany.solutions;

import java.util.*;

/**
 *
 * @author gilvan
 */
public class JavaMap {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            map.put(name, phone);
            in.nextLine();
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            Integer phone = map.get(s);
            if (phone == null || phone <= 0) {
                System.out.println("Not found");
                continue;
            }
            System.out.println(s + "=" + phone);
        }

    }
}
