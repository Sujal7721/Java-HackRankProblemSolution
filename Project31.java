package com.example.hackerrank;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Project31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String regex = "[{()}]$+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        ArrayList<Character> list = new ArrayList();
        for(int i = 0; i < s.length(); i++){
             list.add(s.charAt(i));
             sc.next();
        }
        for(int i = 0; i < s.length(); i++){
            System.out.println(list.get(s.charAt(i)));
        }

    }
}
