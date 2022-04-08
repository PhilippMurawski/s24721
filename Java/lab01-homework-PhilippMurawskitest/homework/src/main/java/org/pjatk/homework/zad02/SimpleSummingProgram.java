package org.pjatk.homework.zad02;

import java.util.Scanner;

public class SimpleSummingProgram
{

    /*
        Użytkownik wprowadza z klawiatury serię liczb różnych od zero,
        zero natomiast jest sygnałem zakończenia wprowadzania danych.
        Napisz program, który obliczy sumę tych liczb
     */
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int sum = 0;

        while (true)
        {
            System.out.println("Podaj Licze do zsumowania. Jeśli chcesz zakończyć Wcisni [0].");

            try
            {


                int read = Integer.parseInt(reader.nextLine());
                if (read == 0) {
                    break;
                }
                sum += read;
                System.out.println("The sum now: " + sum);
            }
            catch (NumberFormatException exception)
            {
                System.out.println("Możesz podawać tylko Liczby !");
            }
        }
    }
}
