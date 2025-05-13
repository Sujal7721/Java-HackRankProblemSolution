package com.example.hackerrank;

import java.util.Scanner;

public class Project26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
          arr[i] = sc.nextInt();
        }
        int total = 0;
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++) {
                for (int k = j; k <= j; k++) {
                    sum += arr[k];
                    if (sum < 0) {
                        total += 1;
                    }
                }
            }
        }
        System.out.println("Negative Subarray is "+total);
    }
}
