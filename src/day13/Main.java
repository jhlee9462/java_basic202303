package day13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static day07.util.Utility.makeLine;
import static day13.Menu.menuList;

public class Main {

    public static void main(String[] args) {

        // stream 의 filter
        // 필터 조건에 맞는 데이터들을 필터링

        // 메뉴 목록중에 채식주의자가 먹을 수 있는 요리를 알려주세요
        List<Dish> vegeList = menuList.stream()
                .filter(Dish::isVegetarian)
                .collect(Collectors.toList());

        System.out.println("===== 채식주의자 식용 요리 목록 =======");

        vegeList.forEach(System.out::println);

        // 메뉴 목록중에 육류이면서 600칼로리 미만인 요리 필터링
        makeLine();

        menuList.stream()
                .filter(dish -> dish.getType() == Dish.Type.MEAT && dish.getCalories() < 600)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        char c = "hello world".toUpperCase()
                .substring(0, 5)
                .charAt(2);

        System.out.println(c);

        // 메뉴 목록에서 요리의 이름이 4글자인 요리들만 필터링해서 출력
        menuList.stream()
                .filter(dish -> dish.getName().length() == 4)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        makeLine();

        // 원하는 개수만 필터링하기
        // 칼로리가 300칼로리보다 큰 요리 중 앞에서 3개만 필터링
        menuList.stream()
                .filter(dish -> dish.getCalories() > 300)
                .skip(2) // 맨앞 제외 2개
                .limit(3) // 최대 3개
                .sorted(Comparator.comparing(Dish::getCalories).reversed())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        makeLine();

        // 메뉴목록에서 처음 등장하는 2 개의 고기요리를 필터링해서 리스트에 반환
        List<Dish> firstTwoMeatDishes = menuList.stream()
                .filter(dish -> dish.getType() == Dish.Type.MEAT)
                .limit(2)
                .collect(Collectors.toList());

        firstTwoMeatDishes.forEach(System.out::println);

        makeLine();

        List<Integer> numbers = List.of(1, 2, 1, 3, 3, 2, 4, 4, 5, 6);

        // 리스트에서 중복 제거하기
        numbers.stream()
                .distinct() // 중복 제거
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
