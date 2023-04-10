package day11.api.system;

import java.util.Arrays;

public class SystemExample {

    public static void main(String[] args) {

        // 운영체제의 현재 시간 읽기
        long time = System.currentTimeMillis();

        // 코드

        long time2 = System.currentTimeMillis();
        System.out.println(time2 - time);

        // 배열 가피
        int[] arr = {10, 20, 30};
        int[] arr2 = new int[3];

        System.arraycopy(arr, 0, arr2, 0, 3);
        System.out.println(Arrays.toString(arr2));
    }
}
