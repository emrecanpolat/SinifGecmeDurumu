package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double matematik, fizik, turkce, kimya, muzik, average;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz: ");
        matematik = input.nextInt();

        System.out.println("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();

        System.out.println("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();

        System.out.println("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();

        System.out.println("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();

        if (matematik <= 100 && matematik>=0 && fizik<=100 && fizik>=0 && turkce<=100 && turkce>=0 && kimya>=0 && kimya<=100 &&muzik>=0 && muzik<=100){
            average = (matematik+fizik+turkce+kimya+muzik)/5;
            System.out.println("Not ortalamanız: " + average);

            if (average>=55){
                System.out.println("Sınıfı Geçtiniz");
            }else {
                System.out.println("Sınıfta kaldınız");
            }
        }else {
            System.out.println("Hatalı değer girdiniz, programı yeniden çalıştırın.");
        }
    }
}
