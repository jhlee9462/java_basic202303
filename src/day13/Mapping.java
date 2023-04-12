package day13;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import static day07.util.Utility.makeLine;
import static day13.Menu.menuList;

public class Mapping {

    public static void main(String[] args) {

        // stream 의 map : 리스트에서 원하는 정보만 추출

        // 메뉴 목록에서 요리의 이름들만 목록으로 추출
        menuList.stream()
                .map(Dish::getName)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        makeLine();

        List<String> words = List.of(
                "safari", "chrome", "ms edge",
                "opera", "firefox"
        );

        List<Integer> wordLengths = words.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println("wordLengths = " + wordLengths);

        makeLine();

        // 메뉴 목록에서 메뉴 이름과 칼로리를 추출하는데 칼로리를 정수가 아닌 문자열로 kcal 을 뒤에 붙여서 추출 후 메뉴이름: xxxkcal
        // 로 출력하고 싶음
        List<SimpleDish> nameAndCalories = menuList.stream()
//                .map(dish -> dish.getName() + ": " + dish.getCalories() + "kcal") // 이 방법은 문자열을 만든다
//                .map(dish -> new SimpleDish(dish.getName(), dish.getCalories() + "")) // dish 의 필드를 사용해서 SimpleDish 생성
                .map(SimpleDish::new) // 생성자 참조
                .collect(Collectors.toList());

        System.out.println(nameAndCalories);

        makeLine();

        /*
            메뉴 목록에서 칼로리가 500칼로리보다 큰 음식들을 필터링한 다음에 음식의 이름과 타입만 추출해서 출력해주세요
         */
        menuList.stream()
                .filter(dish -> dish.getCalories() > 500)
                .map(NameTypeDish::new)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        makeLine();

        // 메뉴 목록에 있는 요리들의 총 칼로리수 구하기
        int totalCalories = menuList.stream()
                .mapToInt(Dish::getCalories)
                .sum();

        System.out.println("totalCalories = " + totalCalories);

        // 육류 메뉴의 평균 칼로리
        double average = menuList.stream()
                .filter(dish -> dish.getType() == Dish.Type.MEAT)
                .mapToInt(Dish::getCalories)
                .average()
                .getAsDouble();
    }
}
