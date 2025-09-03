package com.example.hackerrank;

import java.util.BitSet;
import java.util.Scanner;

public class Project36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        BitSet [] b = {b1,b2};
        String s;
        int x;
        int y;
        for(int i = 0; i < m; i++){
            s = sc.next();
            x = sc.nextInt();
            y = sc.nextInt();

            if("AND".equals(s)){
                b[x-1].and(b[y-1]);
            }else if("OR".equals(s)){
                b[x-1].or(b[y-1]);
            }else if("SET".equals(s)){
                b[x-1].set(y);
            }else if("FLIP".equals(s)){
                b[x-1].flip(y);
            }else if("XOR".equals(s)){
                b[x-1].xor(b[y-1]);
            }
            System.out.println( b[0].cardinality() +" "+ b[1].cardinality());
        }
        sc.close();
    }
}
