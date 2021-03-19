package sBuilderTasks;

import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj polskie imię");
        String name = scanner.next();

        if(name.endsWith("a")){                          //zakładamy, że imię żeńskie zawsze kończy się na "a"
            System.out.println("Imię jest żeńskie");
        }else{
            System.out.println("Imię jest męskie");
        }
    }
}
