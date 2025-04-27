package com.example.hackerrank;

import java.util.Scanner;

//import static sun.jvm.hotspot.HelloWorld.e;

interface Table {
    int display(int n,int i);
//    void line(int a,int b, int t,int n);
}

public class Project1 implements Table{
    public int display(int n,int i){
        int mul;
        if(i == 0) {
            mul = 1;
            return mul;
        }else if(i == 1) {
            mul = 2;
            return mul;
        }else{
            mul = n * 2;
            return mul;
        }

    }

//    public void line(int a,int b, int t, int n){
//        int total;
//        int add;
//        int cng = 2;
//        Project1 e = new Project1();
//        for(int i = 0; i < t;i++) {
//            int m = e.display(n, i);
//            if (m == 1) {
//                total = a + m * b;
//                System.out.printf("%d", total);
//                n = m;
//            } else {
//                add = cng + m * b;
//                System.out.printf(" %d ", add);
//                cng = add;
//                n = m;
//            }
//        }
//    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0;i < t; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int total;
            int l = 2;
            Project1 x = new Project1();
            for(int j = 0; j < n; j++){
                int m = x.display(l,j);
                total = a + m * b;
                System.out.printf("%d ",total);
                a = total;
                l = m;
            }
            System.out.println("");
        }

    }
}



