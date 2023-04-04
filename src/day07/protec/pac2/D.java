package day07.protec.pac2;

import day07.protec.pac1.A;

public class D extends A {

    D() {
        super(10); // protected
//        super("zzz"); // default

        f1 = 1; // protected
//        f2 = 2; //default

        m1(); // protected
//        m2(); // default
    }
}
