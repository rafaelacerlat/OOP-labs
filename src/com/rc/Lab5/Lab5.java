package com.rc.Lab5;

public class Lab5 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();
        F f = new F();
        G g = new G();
        H h = new H();
        I i = new I();
        J j = new J();

        System.out.println(a + "\n" + b + "\n" + c + "\n" + d + "\n" + e + "\n" + f +"\n" + g +"\n" + h +"\n" + i + "\n" + j);


    // If you print any object, Java compiler internally invokes the toString() method on the object. So overriding
    // the toString() method, returns the desired output, it can be the state of an object etc. depending on the
    // implementation.

    }
}
