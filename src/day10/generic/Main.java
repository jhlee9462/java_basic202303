package day10.generic;

import day04.Singer;

public class Main {

    public static void main(String[] args) {

        AppleBasket appleBasket = new AppleBasket();

        BananaBasket bananaBasket = new BananaBasket();

        Basket<Apple> apples = new Basket<>();

        apples.setFruit(new Apple());
//        apples.setFruit(new Banana()); // 불가

        MyList<String> sl = new MyList<>();
        sl.push("짜장");
        sl.push("짬뽕");
        sl.push("탕수육");
        System.out.println(sl);

        MyList<Integer> il = new MyList<Integer>();
        il.push(1);
        il.push(2);
        il.push(3);
        System.out.println("il = " + il);

        MyList<Singer> sli = new MyList<>();
        sli.push(new Singer("sadf"));
        System.out.println(sli);

    }
}
