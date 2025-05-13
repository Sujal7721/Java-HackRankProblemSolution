package com.example.hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class Project22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger x = BigInteger.valueOf(0);
        BigInteger a = new BigInteger(sc.next());
        BigInteger b = new BigInteger(sc.next());
//        System.out.println(a.bitLength());
//        System.out.println(b.bitLength());
        if(a.bitLength() < 200 && b.bitLength() < 200 && x.compareTo(a) < 0 && x.compareTo(b) < 0)
            System.out.println(a.add(b));
            System.out.println(a.multiply(b));

    }
}
