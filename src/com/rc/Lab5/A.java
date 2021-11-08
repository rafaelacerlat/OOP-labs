package com.rc.Lab5;



class A {
    protected String a;
    protected X x = new X("xxx");

    public A() {
    }

//    public A(String a) {
//        this.a = a;
//    }

    public A (String a, X x){
        this.a = a;
        this.x = x;
    }


    public String toString() {
       return String.format("A{a ='%s', x ='%s'}", a, x);
    }


}
