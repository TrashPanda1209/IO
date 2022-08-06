package com.company;

public class Main {

    public static void main(String[] args) {

        Ksztalt motocykl = new Motocykl();
        Ksztalt samochod = new Samochod();

        Ksztalt niebieskiMotocykl
                = new KonkretnyDekoratorKolor(new Motocykl());

        Ksztalt niebieskiSamochod
                = new KonkretnyDekoratorKolor(new Samochod());


        System.out.println("\nMotocykl bez koloru");
        motocykl.rysuj();

        System.out.println("\nSamochod bez koloru");
        samochod.rysuj();

        System.out.println("\nNiebieski motocykl");
        niebieskiMotocykl.rysuj();

        System.out.println("\nNiebieski samochód");
        niebieskiSamochod.rysuj();
    }
}
