package numbersTasks;

import java.util.Scanner;
// ZADANIE BARDZIEJ NADAJĄCE SIĘ DO ZADAŃ GRUPY STRING...
public class Zad11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dokładną cenę spodni");
        String price = scanner.next();                                       // używamy typu String ponieważ łatwiej jest go formatować

        if(price.indexOf(",")!=-1){                                         //Trudne!! - do ogarnięcia metody Stringa
            System.out.println("Cena spodni to: ");
            System.out.println(price.substring(0,price.indexOf(",")).replace(",",""));
            System.out.println(price.substring(price.indexOf(",")).replace(",",""));
        }else{
            System.out.println("Cena to: ");
            System.out.println(price);
        }


    }
}
