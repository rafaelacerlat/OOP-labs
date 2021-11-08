package com.rc.Lab5;

public class J extends I{
    protected String j;

    public J (String j) {
        this.j = j;
    }

    public J (){
    }


    @Override
    public String toString() {
        return String.format("J{a = '%s', b = '%s', c ='%s', d ='%s', e ='%s', f ='%s', g ='%s', h ='%s', i ='%s', " +
                              "j ='%s', x ='%s'}", a, b, c, d, e, f, g, h, i, j, x);
    }
}
