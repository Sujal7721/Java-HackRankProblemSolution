package com.example.hackerrank;

import java.util.Scanner;

class Singloton{
    public static String str;
    private Singloton(){

    }
    public static Singloton getInstance(){
        return new Singloton();
    }

}

public class Project50 {
    public static void main(String[] args) {
        String h = "hello world";
        System.out.println(h);
        Singloton.str = "Hello I am a singleton! Let me say hello world to you";
        System.out.println(Singloton.str);
    }
}
