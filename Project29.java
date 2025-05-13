package com.example.hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class Project29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList arr = new ArrayList(n);

        for(int i = 0; i < n; i++){
            arr.add(sc.nextInt());
        }

        int m = sc.nextInt();
        for(int i = 0; i < m; i++){
            String s = sc.nextLine();
//            sc.nextLine();
            if(s.equals("Insert")){
                int a = sc.nextInt();
                int b = sc.nextInt();
                arr.add(a,b);
            }else if(s.equals("Delete")){
                int c = sc.nextInt();
                arr.remove(c);
            }
        }

        for (Object j : arr) { System.out.print(j + " "); }
    }
}

