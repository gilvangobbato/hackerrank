package com.mycompany.solutions;

import java.io.*;
import static java.lang.System.in;
import java.util.*;

/**
 *
 * @author gilvan
 */
public class JavaList {

    public static void main(String[] args) {
        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            Integer N = Integer.parseInt(br.readLine());
            String str = br.readLine();

            Integer Q = Integer.parseInt(br.readLine());
            String[] list = str.split(" ");
            List<Integer> L = new ArrayList<>(N);
            for (String s : list) {
                L.add(Integer.parseInt(s));
            }

            for (int i = 0; i < Q; i++) {
                String que = br.readLine();
                if (que.contains("Insert")) {
                    String val = br.readLine();
                    String[] vals = val.split(" ");
                    L.add(Integer.parseInt(vals[0]), Integer.parseInt(vals[1]));
                }
                if (que.contains("Delete")) {
                    int X = Integer.parseInt(br.readLine());
                    Integer rem = L.remove(X);
                }
            }

            for (int i = 0; i < L.size(); i++) {
                Integer object = L.get(i);
                System.out.print(object);
                if (i < (L.size() - 1)) {
                    System.out.print(" ");
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println(e);
        }
        System.exit(0);
    }
}
