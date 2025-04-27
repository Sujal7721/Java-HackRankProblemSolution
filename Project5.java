package com.example.hackerrank;

import javafx.application.Preloader;

import java.util.Scanner;

public class Project5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a >= -100 && a <= 100){
            System.out.println(String.valueOf(a));
        }
    }
}
