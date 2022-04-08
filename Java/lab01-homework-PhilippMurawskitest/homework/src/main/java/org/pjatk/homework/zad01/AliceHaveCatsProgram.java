package org.pjatk.homework.zad01;

import java.util.Scanner;

public class AliceHaveCatsProgram {


    /*
        Użytkownik wprowadza z klawiatury liczbę kotów, które posiada pani Ala.
        Napisz program który poprawnie wyświetli zdanie typu 'Ala ma kota'

        np. dla liczby 1 - "Ala ma jednego kota"
            dla liczby 2 - "Ala ma 2 koty"
            dla liczby 9 - "Ala ma 9 kotów"
            dla liczby 23 - "Ala ma 23 koty"
            dla liczby 25 - "Ala ma 25 kotów"
            dla liczby 11 - "Ala ma 11 kotów"
            dla liczby 12 - "Ala ma 12 kotów"
            dla liczby 16 - "Ala ma 16 kotów"
            dla liczby 21 - "Ala ma 21 kotów"
            itd.
     */
    public static void main(String[] args)
    {
        System.out.println("Ile kotów ma Ala ?");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        try
        {
            int aliceCat = sc.nextInt();

            int x = 1;

            if (x >= aliceCat) {
                System.out.println("Ala ma jednego kota");
            } else if (aliceCat == 2) {
                System.out.println("Ala ma " + aliceCat + " koty");
            } else if (aliceCat == 23) {
                System.out.println("Ala ma " + aliceCat + " koty");
            } else {
                System.out.println("Ala ma " + aliceCat + " kotów");
            }
        }
        catch (NumberFormatException exception)
        {
            System.out.println("This is not a number try again!");
            System.exit(1);
        }
    }
}