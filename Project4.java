package com.example.hackerrank;

import javafx.application.Preloader;
import java.lang.Exception;
import java.util.Scanner;

public class Project4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int h = sc.nextInt();
            int b = sc.nextInt();
            int area = h * b;
            if(h > 0 && h >= -100 && h <= 100 && b > 0 && b >= -100 && b <= 100) {
                System.out.println(area);
            } else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}
