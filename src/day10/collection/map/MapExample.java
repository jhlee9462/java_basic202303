package day10.collection.map;

import day09.musicplayer.Singer;

import java.util.HashMap;

import static day07.util.Utility.makeLine;

public class MapExample {

    public static void main(String[] args) {

        HashMap<String, Object> map = new HashMap<>();

        // put(K, V) : 데이터 추가
        map.put("지갑잔액", 5000);
        map.put("좋아하는 가수", new Singer("동방신기"));
        map.put("저녁메뉴", "볶음밥");

        System.out.println(map.size());

        // get(key) : 데이터 참조
        String dinner = (String) map.get("저녁메뉴");
        System.out.println("dinner = " + dinner);

        Singer favoriteSinger = (Singer) map.get("좋아하는 가수");

        System.out.println(map);

        // 수정 ( 이미 존재하는 키의 경우 )
        map.put("저녁메뉴", "짬뽕");
        System.out.println(map);

        // 반복문 처리
        for (String key : map.keySet()) {
            System.out.println("key = " + key);
            System.out.println("map.get(key) = " + map.get(key));
            makeLine();
        }
    }
}
