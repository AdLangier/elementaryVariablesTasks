package com.company;

import java.util.Scanner;

public class Zad6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        double a = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        double b = scanner.nextInt();
        System.out.println("Iloraz tych liczb to " +(a/b));

    }
}
