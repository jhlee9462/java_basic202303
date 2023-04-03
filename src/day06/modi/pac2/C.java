package day06.modi.pac2;

import day06.modi.pac1.A;

public class C {

    void test() {
        A a = new A(); // public
//        A a1 = new A(1); // default
//        A zzzz = new A("zzzz"); // private

        a.f1 = 10; // public
//        a.f2 = 20; // default
//        a.f3 = 30; // private

        a.m1(); // public
//        a.m2(); // default
//        a.m3(); // private

//        B b = new B(); // 클래스 레벨의 default
    }
}
