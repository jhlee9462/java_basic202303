package day12.lambda;

// 사과중에 원하는 필드들만 추출해서 새로운 리스트로 만들기

import java.util.ArrayList;
import java.util.List;

public class MappingApple {

    public static <T, U> List<U> map(List<T> basket, GenericTarget<T, U> target) {
        List<U> mappedList = new ArrayList<>();

        for (T t : basket) {
            mappedList.add(target.select(t));
        }

        return mappedList;

    }

}
