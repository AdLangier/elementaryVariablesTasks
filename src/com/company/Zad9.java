package com.company;

public class Zad9 {
    public static void main(String[] args) {
        int a;                             // <- zmienna "b" nie jest zadeklarowana tak jak zmienna "a"
        int b;
        System.out.println("Hello World");
        a = 20;
        b = 100;                           // podano tylko wartość zmiennej "b"
        System.out.println(a/b);           // - program nie jest w stanie odczytać zmiennej bez zadeklarowania typu tej zmiennej
                                           // - zwyczajnie "nie widzi" zmiennej "b"
                                           // - a jeżeli chodzi o wynik to w przypadku tych liczb powinny być typu "double", "int" pokaże 0
    }
}
