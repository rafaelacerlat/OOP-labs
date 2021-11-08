package com.rc.Lab5;

public class H extends G{
    protected String h;
    protected X x = new X("xxxXX");

    public H( String h, X x) {
        this.h = h;
        this.x = x;
    }

    public H() {
    }

    @Override
    public String toString() {
        return String.format("H{a = '%s', b = '%s', c ='%s', d ='%s', e ='%s', f ='%s', g ='%s', h ='%s', x ='%s'}",
                                a, b, c, d, e, f, g, h, x);
    }


}
