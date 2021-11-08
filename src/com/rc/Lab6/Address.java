package com.rc.Lab6;

public class Address {
    String address;


    public Address(String country, String region, String streetName, int nrApartment){
        address = country + "," + region + "," + streetName + "," + nrApartment;
    }

    public String getAddress(){
        return address;
    }
}
