package com.example.hackerrank;

import java.util.Hashtable;
import java.util.Scanner;

public class Project13 {
     static boolean isAnagram(String a,String b){
        if(a.length()!=b.length()){
            return false;
        }
        char[] a1=a.toLowerCase().toCharArray();
        char[] b1=b.toLowerCase().toCharArray();
        java.util.Arrays.sort(a1);
        java.util.Arrays.sort(b1);

        if(java.util.Arrays.equals(a1,b1)){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = "anagrams";
        String B = "smargana";
        boolean ret = isAnagram(A,B);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");

//        Scanner scan = new Scanner(System.in);
//        String a = scan.next();
//        String b = scan.next();
//        scan.close();
//        boolean ret = isAnagram(a, b);
//        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
