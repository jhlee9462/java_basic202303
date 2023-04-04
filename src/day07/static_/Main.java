package day07.static_;

import day05.member.Gender;
import day07.util.Utility;

// static 필드와 메서드를 그냥 참조 가능
import static day05.member.Gender.MALE;
import static day07.static_.Count.x;
import static day07.util.Utility.makeLine;
import static java.lang.Math.random;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {

        Count c1 = new Count();
        Count c2 = new Count();

        x = 10;
        c2.y = 20;

        x++;

        out.printf("c1 = x : %d, y : %d\n", x, c1.y);
        out.printf("c2 = x : %d, y : %d", x, c2.y);

        Count.m1();
        c1.m2();
        c2.m2();

        makeLine();
        makeLine();

        random();
        int x1 = x;
        out.println();

        Gender male = MALE;
    }
}
