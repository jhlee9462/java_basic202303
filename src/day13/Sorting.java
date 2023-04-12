package day13;

import java.util.Comparator;
import java.util.stream.Collectors;

import static day07.util.Utility.makeLine;
import static day13.Menu.menuList;

public class Sorting {

    public static void main(String[] args) {

        // stream 의 정렬 sorted

        // 메뉴 목록중 칼로리가 낮은 순으로 정렬
        menuList.stream()
                .sorted(Comparator.comparing(Dish::getCalories))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        makeLine();

        // 메뉴 목록중 이름으로 내림차 정렬 ( zyx 순 )
        menuList.stream()
                .sorted(Comparator.comparing(Dish::getName).reversed())
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
