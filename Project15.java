package com.example.hackerrank;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Project15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int testcase = in.nextInt();
        int testcase = Integer.parseInt(in.nextLine());
//        in.next();
        while (testcase > 0){
            String pattern = in.nextLine();
            try {
                Pattern m = Pattern.compile(pattern);
                System.out.println("Valid");
            }
            catch (PatternSyntaxException e){
                System.out.println("Invalid");
            }
            testcase--;
        }
    }
}
