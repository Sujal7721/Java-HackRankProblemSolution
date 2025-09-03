package com.example.hackerrank;

import java.util.Scanner;
import java.util.function.DoublePredicate;
class Prime {
    public static boolean checkprime(int n) {
        int c = 0;
        int [] arr = new int[100];
        boolean m = false;
//        try {
//            if (n == 1 || n == 0) {
//                System.out.println(arr[--c]);
//                c++;
//                m = false;
//            }
//        }catch (ArrayIndexOutOfBoundsException e){
//            m = true;
//            System.out.println();
//        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                m = true;
                break;
            }
        }
        return m;
    }
}

public class Project48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        boolean b = false;
        int [] arr = new int[100];
        while(!b) {
            int n = sc.nextInt();
//            boolean m = false;
//            if (n == 1 || n == 0) {
////                System.out.println("not prime");
//                System.out.println(arr[--c]);
//                c++;
//                m = false;
//                continue;
//            }
//            for (int i = 2; i <= n / 2; i++) {
//                if (n % i == 0) {
//                    m = true;
//                    break;
//                }
//            }
            Prime p = new Prime();

            if (!p.checkprime(n)) {
//                System.out.println(n + " is a prime number");
                arr[c] = n;
                if(n == 0 || n == 1){
                    System.out.println(arr[--c]);
                    c++;
                    continue;
                }else {
                    for (int i = 0; i <= c; i++) {
                        System.out.printf("%d ", arr[i]);
                    }
                }
                System.out.println();
                c++;
            }
        }
    }
}
