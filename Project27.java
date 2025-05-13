package com.example.hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class Project27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int h = 0;
        ArrayList<ArrayList<Integer>> list2 = new ArrayList();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            h = arr[i];
            ArrayList<Integer> list = new ArrayList<>(h);
            for (int j = 0; j < arr[i]; j++) {
                list.add(sc.nextInt());
//                arr1[i] = sc.nextInt();
            }
            list2.add(list);
        }
        int x = sc.nextInt();
        for (int k = 0; k < x; k++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            try {
                int number = list2.get(a-1).get(b-1);
                System.out.println(number);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
    }
}

