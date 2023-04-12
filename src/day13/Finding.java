package day13;

import java.util.Comparator;

import static day13.Menu.menuList;

public class Finding {

    public static void main(String[] args) {

        // 메뉴 목록에서 채식주의자가 먹을 수 있는 요리가 하나라도 존재하는가?
        boolean flag = menuList.stream()
                .anyMatch(Dish::isVegetarian);
        System.out.println("flag = " + flag);

        boolean flag2 = menuList.stream()
                .anyMatch(dish -> dish.getCalories() < 100);
        System.out.println("flag2 = " + flag2);

        // 메뉴 목록의 모든 요리가 1000칼로리 이하인가?
        boolean flag3 = menuList.stream()
                .allMatch(dish -> dish.getCalories() <= 1000);
        System.out.println("flag3 = " + flag3);

        // nonMatch : allMatch 의 반대
        boolean flag4 = menuList.stream()
                .noneMatch(dish -> dish.getCalories() <= 1000);
        System.out.println("flag4 = " + flag4);

        Dish dish = menuList.stream()
                .min(Comparator.comparing(Dish::getCalories))
                .get();

        System.out.println("dish = " + dish);

    }
}
