package com.rc.Lab5;

class C extends B{
    protected String c;

    public C(String c) {

        this.c = c;
    }

    public C() {
    }

    @Override
    public String toString() {
        return String.format("C{a ='%s', b ='%s', c ='%s' x ='%s'}", a, b, c, x);
    }
}
