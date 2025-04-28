package com.example.hackerrank;

import java.util.Scanner;

public class Project9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int x = A.length();
        int y = B.length();
        int sum = x + y;

        System.out.println(sum);
//        System.out.println(A.charAt(0));

//      To check alphabetic order in first letter is greater and smaller ***lexicographical
        if(A.charAt(0) > B.charAt(0)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        String p = A.substring(0,1).toUpperCase()+A.substring(1);
        String q = B.substring(0,1).toUpperCase()+B.substring(1);

        System.out.println(p +" "+ q);


    }
}
