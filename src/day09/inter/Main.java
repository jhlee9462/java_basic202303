package day09.inter;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        BullDog bullDog = new BullDog();

        bullDog.hunt();
        bullDog.violent();

        Duck duck = new Duck("꽥꽥이", 3);

        duck.eat();

        // 인터페이스는 다형성을 구현하는 역할
        Pet[] pets = {
                bullDog,
                duck,
        };

        Shark shark = new Shark();
        shark.hunt();
    }
}
