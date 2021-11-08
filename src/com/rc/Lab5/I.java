package com.rc.Lab5;

public class I extends H{
    protected String i;

    public I( String i) {
        this.i = i;
    }

    public I() {
    }

    @Override
    public String toString() {
        return String.format("I{a = '%s', b = '%s', c ='%s', d ='%s', e ='%s', f ='%s', g ='%s', h ='%s', i ='%s'," +
                             " x ='%s'}", a, b, c, d, e, f, g, h, i, x);
    }
}
