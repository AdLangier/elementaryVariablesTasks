package numbersTasks;

import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = 5000;
        System.out.println("Ile chcesz wypłacić ?");
        double withdraw = scanner.nextDouble();                    //"nextDouble()" przy klasie Scanner
        double balance = amount - withdraw;

        if (withdraw > amount) {
            System.out.println("Niepoprawna operacja");
        } else {
            System.out.println("Pozostałe saldo: " + String.format("%.2f", balance) + " PLN");  //wyświetlanie miejsc po przecinku --> Zad13
        }
    }
}
