package com.example.hackerrank;

import java.util.Scanner;
import java.util.*;
class Checker implements Comparator<Player> {
    public int compare(Player a, Player b) {
        String name1 = a.name;
        String name2 = b.name;
        int score1 = a.score;
        int score2 = b.score;
        if(score1 < score2){
            return 1;
        }else if(score1 > score2){
            return -1;
        }else{
            return name1.compareTo(name2);
        }
    }
}
class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

public class Project33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
