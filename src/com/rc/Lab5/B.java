package com.rc.Lab5;

class B extends A{
    protected String b;

    public B(String b) {
        this.b = b;
    }

    public B() {
    }

    @Override
    public String toString() {
        return String.format("B{a ='%s', b ='%s', x ='%s'}", a, b, x);
    }
}
