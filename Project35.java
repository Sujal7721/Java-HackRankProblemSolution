package com.example.hackerrank;

import java.util.*;

public class Project35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int[] arr = new int[10000000];
        int n = in.nextInt();
        int m = in.nextInt();
        int unique = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (i >= m) {
                int val = deque.removeLast();
                if (arr[val] >= 1) {
                    arr[val]--;
                    if (arr[val] == 0) {
                        unique--;
                    }
                }
            }

            int num = in.nextInt();
            deque.addFirst(num);
            if (arr[num] == 0) {
                unique++;
                if (unique == m) {
                    System.out.println(unique);
                    return;
                }
                max = Math.max(max, unique);
            }
            arr[num]++;
        }
        System.out.println(max);
    }
}