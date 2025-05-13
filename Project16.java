package com.example.hackerrank;

import java.util.Scanner;
import java.util.regex.Pattern;

//class MyRegex {
//    public boolean pattern(String s) {
//        int count = 0;
//        String[] v = s.split("[.]");
////        System.out.println(v.length);
//        if (4 == v.length ) {
//            for (String s1 : v) {
//                int x = Integer.parseInt(s1);
//                if (s1.length() <= 3 && 0 <= x && x < 255) {
////                    System.out.println(s1);
//                } else {
//                    count++;
//                }
//            }
//        } else {
//            count = 1;
//        }
//        if (count == 0) {
//            return true;
//        }
//        return false;
//    }
//}

public class Project16 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            while (in.hasNext()) {
               String IP = in.next();
//                System.out.println(new MyRegex().pattern(IP));
            System.out.println(IP.matches(new MyRegex().pattern));
            }
    }
}

class MyRegex {
    String pattern = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\."
            + "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\."
            + "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\."
            + "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
}