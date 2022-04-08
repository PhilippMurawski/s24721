package com.pjatk.pesel.model;

public class PeselValidator {
    public static boolean isValid(String pesel) {
        int[] weights = new int[]{1,3,7,9,1,3,7,9,1,3};
        int sumaKontrolna = 0;
        for(int i = 0; i<10; i++){
            int digitOfPeselNumber = Integer.parseInt(pesel.substring(i, i+1));
            int temp = digitOfPeselNumber*weights[i];

            if (temp > 10){
                sumaKontrolna+= (temp%10);
            }else{
                sumaKontrolna+=temp;
            }

        }
        if (sumaKontrolna > 10){
            sumaKontrolna = sumaKontrolna%10;
        }
        sumaKontrolna = 10-sumaKontrolna;
        if (sumaKontrolna == Integer.parseInt(pesel.substring(10))){
            return true;
        }else{
            return false;
        }
    }
}
