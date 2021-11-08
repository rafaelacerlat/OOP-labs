package com.rc.Lab6;

public class History {
    String sickNess;

    public History(String symptoms, String diagnosticResults, String treatment){
        sickNess= String.join("\n", symptoms, diagnosticResults, treatment);
    }

    public String getSickNess() {
        return sickNess;
    }
    public Boolean isSick(){
        return sickNess != null;
    }
}
