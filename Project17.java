package com.example.hackerrank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Integer.parseInt;


public class Project17 {
    public static void main(String[] args) {
//        This regex for repeate case-sensitive words.
//        String regex = "\\b(\\w+)\\b(?:\\s+\\1\\b)+";

//        This regex for repeated case-insensitive words.
        String regex = "(?i)\\\\b(\\\\w+)\\\\b(?:\\\\s+\\\\1\\\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(regex,"$1");

            }
            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }
}
