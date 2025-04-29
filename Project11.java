package com.example.hackerrank;

import java.util.ArrayList;
import java.util.Collections;


public class Project11 {

    public static String number(String s, int k){
        String smallest;
        String largest;
        ArrayList<String> res = new ArrayList<>();
        int l = s.length() - k;
//        System.out.println(l);
        for (int i = 0; i <= l; i++) {
            String c = s.substring(i , i+k);
            res.add(c);
        }
        Collections.sort(res);
        smallest = res.get(0);
        largest = res.get(res.size() - 1);
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        String s = "welcometojava";
        int l = 3;
        System.out.println(number(s,l));

    }
}
