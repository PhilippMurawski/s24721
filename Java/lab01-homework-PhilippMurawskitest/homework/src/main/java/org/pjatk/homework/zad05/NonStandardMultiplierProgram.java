package org.pjatk.homework.zad05;

import java.util.Scanner;

/*
    Napisz program obliczający iloczyn dowolnej pary
    liczb całkowitych, nie korzystając z operatora *.
    Do dyspozycji masz operatory + i --.
 */
public class NonStandardMultiplierProgram
{

        static boolean validateInput(String input)
        {
        int parsedInput;
        try
        {
            parsedInput = Integer.parseInt(input);
        } catch (NumberFormatException exception)
        {
            return false;
        }
        return true;
    }
        static int takeInput(String info)
        {
        System.out.println(info);
        while (true)
        {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            if (validateInput(input))
            {
                return Integer.parseInt(input);
            } else
            {
                System.out.println("This is not a number try again");
            }
        }
    }

        public static void main(String[] args)
        {
        int num1 = takeInput("Enter your first number");
        int num2 = takeInput("Enter your second number");
        int sum = 0;
        if (num2 < 0)
        {
            for (int i = 0; i > num2; i--)
            {
                sum -= num1;
                System.out.println(+sum);
            }
        }else{
            for (int i = 1; i <= num2; i++){
                sum += num1;
                System.out.println(+sum);
            }
        }
        System.out.println(sum);
    }
    }
