package com.rc.Lab5;

public class E extends D {
    protected String e;

    public E() {
    }

    public E( String e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return String.format("E{a ='%s', b ='%s', c ='%s', d ='%s', e ='%s', x ='%s'}", a, b, c, d, e, x);
    }
}
