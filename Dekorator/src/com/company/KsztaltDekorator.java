package com.company;

public abstract class KsztaltDekorator implements Ksztalt{

    protected Ksztalt dekoratorKsztalt;

    // Metoda klasy abstrakcyjnej dekoratora
    public KsztaltDekorator(Ksztalt delkoratorKsztalt)
    {
        this.dekoratorKsztalt = delkoratorKsztalt;
    }

    public void rysuj() { dekoratorKsztalt.rysuj(); }
}
