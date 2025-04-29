package com.example.hackerrank;

import java.util.Scanner;

public class Project14 {
    public static void main(String[] args) {
        String s = "[A-Z_e]+d";

        String regex = "[^A-Za-z]+";
        String[] x = s.split(regex);
        s = s.trim();
//        System.out.println(x.length);
        int count = 0;
        if (s.isEmpty()) {
            count = 0;
        } else {
            for (String s1 : x) {
                count++;
            }
        }
        System.out.println(count);
        for (String s1 : x) {
            if (!s1.isEmpty()) {
                System.out.println(s1);
            }
        }

//                **************++++++*************

//        Scanner scan = new Scanner(System.in);
//        String s = scan.nextLine();
//        // Write your code here.
//        s=s.trim();
//        if(s.isEmpty()){
//            System.out.println(0);
//            return ;
//
//        }
//        String[] token=s.split("[^A-Za-z]+");
//        System.out.println(token.length);
//        for(String arr:token){
//            System.out.println(arr);
//
//        }
//
//        scan.close();
    }
}
