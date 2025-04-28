package com.example.hackerrank;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class Project7 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india = NumberFormat.getCurrencyInstance(new Locale("en","in")).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.println(us);
        System.out.println(india);
        System.out.println(china);
        System.out.println(france);

    }
}
