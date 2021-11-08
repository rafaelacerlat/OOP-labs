package com.rc.Lab6;

import java.util.ArrayList;

public class Patient extends Person {
    String id;
    FullName name;
    Gender gender;
    Date birthDate;
    int age;
    Date accepted;
    History sickness;
    String[] prescriptions;
    String[] allergies;
    String[] specialReqs;

    private ArrayList<OperationsStaff> operationsStaff;
}
