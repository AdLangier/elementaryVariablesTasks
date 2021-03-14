package com.company;

import java.util.Scanner;

public class Zad7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj promień koła");
        int r = scanner.nextInt();
        System.out.println("Pole koła o promieniu "+r+" wynosi "+(Math.PI*r*r));


    }
}
