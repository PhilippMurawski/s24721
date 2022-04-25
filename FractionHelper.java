package com.example;

import com.example.Fraction;

public class FractionHelper {

    public static Fraction simplify(Fraction ulamek) {
        Fraction wynik = new Fraction(ulamek.licznik, ulamek.mianownik);
        int gcd = gcd(wynik.getLicznik(), wynik.getMianownik());
        wynik.setLicznik(wynik.getLicznik() / gcd);
        wynik.setMianownik(wynik.getMianownik() / gcd);
        return wynik;
    }

    public static int gcd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }

        }

        return a;
    }
}