package com.example.hackerrank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Project19 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());
        while (testCases-- > 0) {
            String line = scanner.nextLine();
            String regex ="<(.+)>([A-Za-b0-9\\\\s]{0,10000}+)</\\\\1>";
//            String regex = "<(.+)>([^<]+)</\\\\1>";

            Pattern r = Pattern.compile(regex);
            Matcher m = r.matcher(line);
            try {
                if (m.find()) {
//                do {
                    System.out.println(m.group(2));
//                } while (m.find());
                } else {
                    System.out.println("None");
                }
            }catch (PatternSyntaxException e){
                System.out.println("None");
            }

        }
    }
}


