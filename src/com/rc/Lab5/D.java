package com.rc.Lab5;

public class D extends C{
    protected String d;
    protected X x = new X("xxxX");

    public D(String d, X x) {
        this.d = d;
        this.x = x;
    }

    public D() {
    }

    @Override
    public String toString() {
        return String.format("D{a ='%s', b ='%s', c ='%s', d ='%s', x ='%s'}", a, b, c, d, x);
    }
}
