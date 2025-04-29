package com.example.hackerrank;

import java.util.Scanner;

public class Project12 {
    public static void main(String[] args) {
        //        find the word Palindrome

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String ch = "";
        char [] p = new char[A.length()];

        for(int i = 0; i < A.length(); i++){
            p[i] = A.charAt(i);
            ch = p[i] + ch;
//            System.out.println(ch);
        }

        if(A.equals(ch)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        System.out.println(ch);

    }
}
