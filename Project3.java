package com.example.hackerrank;

import java.util.Scanner;

public class Project3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String x = sc.nextLine();
//        String y = sc.nextLine();
//        String z = sc.nextLine();
//        System.out.println("1 "+x);
//        System.out.println("2 "+y);
//        System.out.println("3 "+z);

        int a = 0;
        while(sc.hasNextLine()) {
            String s = sc.nextLine();
            a++;
            System.out.println(a + " " + s);
            if (s.endsWith("Read me until end-of-file."))
                break;
        }


//        ****************/////********************
//        Scanner sc = new Scanner(System.in);
//        int line_num = 0;
//        while(sc.hasNext())
//            System.out.println(++line_num + " " + sc.nextLine());
//        sc.close();

    }
}
