package day12.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// 사과를 여러 방법으로 필터링
public class FilterApple {

    /**
     * @solution - try1 : 사과 바구니에서 녹색사과만 필터링해야 한다.
     * @param1 basket : 여러 사과가 모여있는 바구니
     * @return : 녹색사과들만 모여있는 바구니
     * @problem
     * - 다른 색상으로 필터하고 싶다면?
     */
    public static List<Apple> filterGreenApples(List<Apple> basket) {

        // 녹색사과만 담을 바구니
        List<Apple> greenApples = new ArrayList<>();
        // 반복문을 통해 필터링
        for (Apple apple : basket) {
            if (apple.getColor() == Color.GREEN)
                greenApples.add(apple);
        }

        return greenApples;

    }

    /**
     * @solution - try 2 : 색상을 파라미터화 한다
     * @problem
     * - 만약에 필터기준이 색상이 아니라 무게라면?
     */
    public static List<Apple> filterApplesByColor(List<Apple> basket, Color color) {

        List<Apple> targetApples = new ArrayList<>();

        for (Apple apple : basket) {
            if (apple.getColor() == color)
                targetApples.add(apple);
        }

        return targetApples;
    }

    /**
     * @solution - try 3 : 동작을 파라미터화 한다. - 추상적 조건으로 필터링
     *
     * @problem
     * - 오렌지 바구니를 필터링해야한다면?
     * - 전자제품 바구니를 필터링해야한다면?
     */
    public static List<Apple> filterApples(List<Apple> basket, ApplePredicate predicate) {
        List<Apple> targetApples = new ArrayList<>();

        for (Apple apple : basket) {
            if (predicate.test(apple))
                targetApples.add(apple);
        }

        return targetApples;
    }

    /**
     * @solution - try 4 : 제네릭 필터 메서드 생성
     */
    public static <T> List<T> filter(List<T> basket, GenericPredicate<T> predicate) {
        List<T> targetList = new ArrayList<>();

        for (T t : basket) {
            if (predicate.test(t))
                targetList.add(t);
        }

        return targetList;
    }
}
