package com.example.hackerrank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Project44 {

    private static boolean q;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int x=sc.nextInt();
            int y=sc.nextInt();
            int c=x/y;
            System.out.println(c);
        }catch(InputMismatchException q){
            System.out.println("java.util.InputMismatchException");
        }
        catch(Exception q){
            System.out.println(q);
        }
    }
}
