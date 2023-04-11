package day11.api.obj;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Pen p1 = new Pen(new Company("모나미", "서울") ,123, "빨강", 1000);

        Pen p2 = new Pen(null, 123, "빨강", 1000);

        System.out.println(p1);

        System.out.println(p2);

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

        Set<Pen> penSet = new HashSet<>();
        penSet.add(p1);
        penSet.add(p2);

        System.out.println(penSet.size());

        System.out.println(Integer.toHexString(p1.hashCode()));
        System.out.println(Integer.toHexString(p2.hashCode()));
    }
}