package org.pjatk.homework.zad06;

import java.util.Scanner;

/*
    Napisz program który sprawdzi, czy wprowadzone zdanie
    jest palindromem, czyli brzmi tak samo czytane od strony lewej do prawej
    i od prawej do lewej.
    Przykład zdania-palindromu jest 'Kobyła ma mały bok' (bez rozróźniania wielkości
    liter i uwzględniania odstępów miezy słowami)
 */
public class PalindromProgram
{

    public static void main(String[] args)
    {
        System.out.println("Podaj słowo:");
        Scanner input = new Scanner(System.in);

        String original = input.nextLine();
        original =  original.replace( " ","");
        original =  original.replaceAll("([A-Z])", "$1").toLowerCase();
        String reverse = "";
        for (int i = original.length() -1; i >= 0; i--)
        {
            reverse += original.charAt(i);
            System.out.println(reverse);
        }

        boolean palindrom = true;
        for (int i = 0; i <original.length(); i++)
        {
            if (original.charAt(i)!= reverse.charAt(i))
            {
                palindrom = false;
            }
        }

        if (palindrom)
        {
            System.out.println("Jest Palindromem!");
        }
        else
        {
            System.out.println("Nie jest palindromem!");
        }

    }

}
