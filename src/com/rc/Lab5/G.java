package com.rc.Lab5;

public class G extends F {
    protected String g;

    public G(String g) {
        this.g = g;
    }

    public G() {
    }

    @Override
    public String toString() {
        return String.format("G{a ='%s', b ='%s', c ='%s', d ='%s', e ='%s', f ='%s', g ='%s', x ='%s'}",
                                a, b, c, d, e, f, g, x);
    }
}
