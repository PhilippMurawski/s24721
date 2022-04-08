package org.pjatk.homework.zad03;

import java.util.Scanner;

public class RingFieldProgram
{

    /*
        Napisz program obliczający pole powierzchni pierścienia kołowego
        o promieniu zewnętrznym R i wewnętrznym r. Długości promieni użytkownik
        wprowadza z klawiatury. Program powinien zasygnalizować błędne dane
        i ponownie zapytać o potrzebną wartość.
     */
    public static void main(String[] args) {
        try
        {
            double num1;
            double num2;
            float pi = 3.14f;
            double sum;

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the outer ring radius (R): ");
            num1 = scan.nextDouble();
            System.out.println("Enter the inner ring radius (r): ");
            num2 = scan.nextDouble();
            sum = pi * ((num1 * num1) + (num2 * num2));
            System.out.println("the area of the ring is: " + sum);
        }
        catch (NumberFormatException e)
        {
            System.out.println("This is not a number try again!");
            System.exit(1);
        }

    }
}
