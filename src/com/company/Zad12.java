package com.company;

import java.util.Scanner;

public class Zad12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int a = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int b = scanner.nextInt();
        int c = a;
        a=b;
        b=c;

        System.out.println("Zamienione liczby to "+a+" "+b);


    }
}
