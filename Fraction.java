package com.esxample;
import com.example.FractionHelper;
public class Fraction {
    int licznik;
    int mianownik;

    public Fraction(int l, int m) {
        this.licznik=l;
        this.mianownik=m;
    }

    public int getLicznik(){
        return this.licznik;
    }
    public int getMianownik(){
        return this.mianownik;
    }

    public void setLicznik(int l){
        this.licznik = l;
    }

    public void setMianownik(int m){
        this.mianownik = m;
    }

    public Fraction plus(Fraction ulamek){
        Fraction a = new Fraction(this.licznik, this.mianownik);
        Fraction b = new Fraction(ulamek.getLicznik(), ulamek.getMianownik());
        Fraction wynik = new Fraction(a.licznik*b.mianownik+b.licznik*a.mianownik,a.mianownik*b.mianownik);
        return wynik;
    }
    public Fraction minus(Fraction ulamek){
        Fraction a = new Fraction(this.licznik, this.mianownik);
        Fraction b = new Fraction(ulamek.getLicznik(), ulamek.getMianownik());
        Fraction wynik = new Fraction(a.licznik*b.mianownik-b.licznik*a.mianownik,a.mianownik*b.mianownik);
        return wynik;
    }

    @Override
    public String toString() {
        String stringToReturn = this.licznik+"/"+this.mianownik;
        return stringToReturn;
    }

    public boolean equals(Fraction ulamek) {
        Fraction a = FractionHelper.simplify(new Fraction(this.licznik, this.mianownik));
        Fraction b = FractionHelper.simplify(new Fraction(ulamek.getLicznik(), ulamek.getMianownik()));
        if (a.mianownik== b.mianownik && a.licznik==b.licznik){
            return true;
        }
        return false;
    }



}
