package com.example.hackerrank;

import java.util.Scanner;

public class Project25 {
    public static void main(String[] args) {
        int sum;
        int maxsum = Integer.MIN_VALUE;
        int [][] a = new int[6][6];
        Scanner sc = new Scanner(System.in);
//        try(Scanner sc = new Scanner(System.in);){
        for(int i=0; i<6; i++){
            for(int j=0; j<6; j++){
                a[i][j]=sc.nextInt();
            }
        }
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
//                    a[i][j]=sc.nextInt();
                    if(i > 1 && j > 1) {
                        sum = a[i][j]
                                + a[i][j - 1]
                                + a[i][j - 2]
                                + a[i - 1][j - 1]
                                + a[i - 2][j]
                                + a[i - 2][j - 1]
                                + a[i - 2][j - 2];
                        if (sum > maxsum) {
                            maxsum = sum;
                        }
                    }
                }
            }
//        }
        System.out.println(maxsum);
    }
}
