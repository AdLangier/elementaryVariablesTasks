package sBuilderTasks;

import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kod pocztowy");
        String code = scanner.nextLine();
        StringBuilder postcode = new StringBuilder(code);

        if (code.charAt(2) != '-'){                                   //użycie typu "char"
            System.out.println(postcode.insert(2,'-'));
        }else{
            System.out.println(code);
        }
    }
}
