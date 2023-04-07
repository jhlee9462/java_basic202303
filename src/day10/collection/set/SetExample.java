package day10.collection.set;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
    - 집합 자료구조
    - 저장순서를 보강하지 않음
    - 인덱스, 키를 사용하지 않아서 개별탐색이 불리함
    - 저장값의 중복을 허용하지 않음
 */
public class SetExample {

    public static void main(String[] args) {

        HashSet<String> foodSet = new HashSet<>();

        // 데이터 추가 add(E e)
        foodSet.add("김말이");
        foodSet.add("닭꼬치");
        foodSet.add("단무지");
        foodSet.add("김밥");

        System.out.println(foodSet.size());
        System.out.println("foodSet = " + foodSet);

        System.out.println(foodSet.add("김말이"));

        for (String food : foodSet) {
            System.out.println("food = " + food);
        }

        // remove(obj) : 삭제
        foodSet.remove("단무지");

        System.out.println("foodSet = " + foodSet);

        ArrayList<Integer> numbers = new ArrayList<>(
                Arrays.asList(1, 1, 1, 3, 3, 5, 7, 9, 9)
        );

        // 리스트를 SET 으로 변환
        HashSet<Object> numberSet = new HashSet<>(numbers);
        System.out.println("numberSet = " + numberSet);

    }
}
