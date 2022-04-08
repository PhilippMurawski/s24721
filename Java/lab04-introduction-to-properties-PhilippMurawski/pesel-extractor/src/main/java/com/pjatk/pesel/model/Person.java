package com.pjatk.pesel.model;

import java.time.LocalDate;

public class Person {
    private String name;
    private String surname;
    private String pesel;
    private String gender;
    private LocalDate dateOfBirth;

    public Person(String p) {
        pesel = p;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGender() {
        int genderNumber = Integer.valueOf(pesel.charAt(9));
        if (genderNumber % 2 == 0) {
            return "female";
        } else {
            return "male";
        }

    }

    public LocalDate getDateOfBirth() {
        int year = Integer.parseInt(pesel.substring(0,2));
        int month = Integer.parseInt(pesel.substring(2,4));
        int day = Integer.parseInt(pesel.substring(4,6));
        if (month >= 12){
            year += 2000;
            month -=20;
        }else{
            year += 1900;
        }
        dateOfBirth=LocalDate.of(year, month, day);
        return dateOfBirth;
    }

    public String getPeselNumber() {
        return pesel;
    }

    public void setName(String n) {
        name = n;
    }

    public void setSurname(String s) {
        surname = s;
    }

}