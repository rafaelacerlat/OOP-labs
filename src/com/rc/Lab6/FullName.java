package com.rc.Lab6;

public class FullName {
    String name;

    FullName (String givenName, String middleName, String familyName) {
        name = givenName + "" + middleName +"" + familyName;
    }

    String getName() {
        return name;
    }
}
