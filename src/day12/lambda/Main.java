package day12.lambda;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static day12.lambda.Color.*;
import static day12.lambda.FilterApple.*;
import static day12.lambda.MappingApple.map;

public class Main {

    public static void main(String[] args) {

        // 사과 바구니 생성
        List<Apple> appleBasket = List.of(
                new Apple(80, GREEN),
                new Apple(155, GREEN),
                new Apple(120, RED),
                new Apple(97, RED),
                new Apple(200, YELLOW),
                new Apple(50, RED),
                new Apple(75, GREEN),
                new Apple(200, YELLOW)
        );

        System.out.println("============녹색사과 필터링==============");
        List<Apple> greenApples = filterGreenApples(appleBasket);

        for (Apple greenApple : greenApples) {
            System.out.println(greenApple);
        }

        System.out.println("============노란사과 필터링==============");
        List<Apple> yellowApples = filterApplesByColor(appleBasket, YELLOW);

        for (Apple yellowApple : yellowApples) {
            System.out.println(yellowApple);
        }

        System.out.println("===========무게로 검사===================");
        List<Apple> heavyApples = filterApples(appleBasket, apple -> apple.getWeight() > 90);

        for (Apple heavyApple : heavyApples) {
            System.out.println(heavyApple);
        }

        // 녹색이면서 100g보다 큰 사과들만 필터링 (익명 클래스)
        System.out.println("================종합검사===============");
        List<Apple> greenAndHeavyApples = filterApples(appleBasket, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() > 100 && apple.getColor() == GREEN;
            }
        });

        for (Apple greenAndHeavyApple : greenAndHeavyApples) {
            System.out.println(greenAndHeavyApple);
        }

        System.out.println("==========================");

        List<Apple> apples = filter(appleBasket, apple -> apple.getWeight() > 90 && apple.getWeight() < 100);

        for (Apple apple : apples) {
            System.out.println(apple);
        }

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evens = filter(numbers, n -> n % 2 == 0);

        System.out.println(evens);

        List<String> words = List.of("moments", "pink", "floyd", "radio", "head", "led", "zeppelin", "queen", "chemical", "romance");

        List<String> filter3 = words.stream()
                .filter(w -> w.length() < 5)
                .collect(Collectors.toList());

        System.out.println(filter3);

        // 사과 바구니에서 색깔만 추출
        List<Color> appleColors = map(appleBasket, Apple::getColor);

        System.out.println(appleColors);
    }
}
