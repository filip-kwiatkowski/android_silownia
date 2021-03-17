package com.example.silowniawms;

import java.sql.Time;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Dane {

    private static Dane single_instance = null;
    public static ArrayList<Zajecia> wybraneZajecia;
    public static ArrayList<Zajecia> dostepneZajecia;
    public static ArrayList<Zajecia> historia;

    private Dane() {
        wybraneZajecia = new ArrayList<Zajecia>();
        dostepneZajecia = new ArrayList<Zajecia>();
        historia = new ArrayList<Zajecia>();
        dostepneZajecia.add(new Zajecia("Zumba", new Time(10, 0, 0), new Time(11, 0, 0)));
        dostepneZajecia.add(new Zajecia("Fat Burning", new Time(17, 30, 0), new Time(18, 30, 0)));
        dostepneZajecia.add(new Zajecia("Joga", new Time(11, 0, 0), new Time(12, 30, 0)));
        dostepneZajecia.add(new Zajecia("Interwał", new Time(19, 0, 0), new Time(19, 45, 0)));
        dostepneZajecia.add(new Zajecia("Fat Burning", new Time(16, 0, 0), new Time(17, 0, 0)));
        dostepneZajecia.add(new Zajecia("Pilates", new Time(15, 0, 0), new Time(16, 0, 0)));
        dostepneZajecia.add(new Zajecia("Stretching", new Time(20, 0, 0), new Time(21, 0, 0)));
        dostepneZajecia.add(new Zajecia("Taniec brzucha", new Time(16, 0, 0), new Time(17, 0, 0)));
        historia.add(new Zajecia("Fat Burning", new Time(17, 30, 0), new Time(18, 30, 0)));
        historia.add(new Zajecia("Joga", new Time(11, 0, 0), new Time(12, 30, 0)));
    }

    public static Dane getInstance() {
        if (single_instance == null) {
            single_instance = new Dane();
        }
        return  single_instance;
    }

    public static ArrayList<Zajecia> getWybraneZajecia() {
        return wybraneZajecia;
    }

    public static ArrayList<Zajecia> getDostepneZajecia() {
        return dostepneZajecia;
    }

    public static ArrayList<Zajecia> getHistoria() {
        return historia;
    }

    public static void dodajWybrane(Zajecia zajecia) {
        wybraneZajecia.add(zajecia);
    }

    public static void usunWybrane(int i) {
        wybraneZajecia.remove(i);
    }

    public static void dodajDostepne(Zajecia zajecia) {
        dostepneZajecia.add(zajecia);
    }

    public static void usunDostepne(int i) {
        dostepneZajecia.remove(i);
    }

    public static void dodajHistorie(Zajecia zajecia) {
        historia.add(zajecia);
    }
}
