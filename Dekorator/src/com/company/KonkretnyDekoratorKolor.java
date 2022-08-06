package com.company;

public class KonkretnyDekoratorKolor extends KsztaltDekorator{
    public KonkretnyDekoratorKolor(Ksztalt dekoratorKsztalt)
    {
        super(dekoratorKsztalt);
    }

    @Override public void rysuj()
    {
        dekoratorKsztalt.rysuj();
        pomaluj(dekoratorKsztalt);
    }

    private void pomaluj(Ksztalt dekoratorKsztalt)
    {
        System.out.println("Kolor: Niebieski");
    }
}
