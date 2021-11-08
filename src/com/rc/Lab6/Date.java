package com.rc.Lab6;

public class Date {
    String birthDate;

     public Date(int year, int month, int date) {
         birthDate = date + "," + month + "," + year;
     }

    public String getBirthDate(){
        return birthDate;
    }
}
