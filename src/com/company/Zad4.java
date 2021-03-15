package com.company;

import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbę całkowitą");
        int number = scanner.nextInt();
        System.out.println("ostatnia cyfra liczby to: ");
        System.out.println(number%10);                          // DO ZAPAMIĘTANIA !!!!!!!!!!!!!!!

    }
}
