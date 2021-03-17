package com.example.silowniawms;

import java.sql.Date;
import java.sql.Time;

public class Zajecia {

    private final String nazwa;
    private final Time godzinaRozpoczecia;
    private final Time godzinaZakonczenia;

    public Zajecia(String nazwa, Time godzinaRozpoczecia, Time godzinaZakonczenia) {
        this.nazwa = nazwa;
        this.godzinaRozpoczecia = godzinaRozpoczecia;
        this.godzinaZakonczenia = godzinaZakonczenia;
    }

    @Override
    public String toString() {
        return nazwa + " " + godzinaRozpoczecia + "-" + godzinaZakonczenia;
    }
}
