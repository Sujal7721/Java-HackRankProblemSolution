package com.example.hackerrank;
import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//Write your code here
class Add{
    public static void add(int n1,int n2){
        System.out.printf("%d+%d=%d\n",n1,n2,n1+n2);
    }
    public static void add(int n1,int n2,int n3){
        System.out.printf("%d+%d+%d=%d\n",n1,n2,n3,n1+n2+n3);
    }
    public static void add(int n1,int n2,int n3,int n4,int n5){
        System.out.printf("%d+%d+%d+%d+%d=%d\n",n1,n2,n3,n4,n5,n1+n2+n3+n4+n5);
    }
    public static void add(int n1,int n2,int n3,int n4,int n5,int n6){
        System.out.printf("%d+%d+%d+%d+%d+%d=%d\n",n1,n2,n3,n4,n5,n6,n1+n2+n3+n4+n5+n6);
    }
}


public class Project46 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(br.readLine());
        int n2 = Integer.parseInt(br.readLine());
        int n3 = Integer.parseInt(br.readLine());
        int n4 = Integer.parseInt(br.readLine());
        int n5 = Integer.parseInt(br.readLine());
        int n6 = Integer.parseInt(br.readLine());
        Add ob = new Add();
        ob.add(n1, n2);
        ob.add(n1, n2, n3);
        ob.add(n1, n2, n3, n4, n5);
        ob.add(n1, n2, n3, n4, n5, n6);
        Method[] methods = Add.class.getDeclaredMethods();
        Set<String> set = new HashSet<>();
        boolean overload = false;
        for (int i = 0; i < methods.length; i++) {
            if (set.contains(methods[i].getName())) {
                overload = true;
                break;
            }
            set.add(methods[i].getName());

        }
    }
}



