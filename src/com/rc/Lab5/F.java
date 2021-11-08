package com.rc.Lab5;

public class F extends E{
    protected String f;

    public F( String f) {
        this.f = f;
    }

    public F() {
    }

    @Override
    public String toString() {
        return String.format("F{a ='%s', b ='%s', c ='%s', d ='%s', e='%s', f ='%s', x ='%s'}", a, b, c, d, e, f, x);
    }
}
