package day03;

import java.util.Arrays;

public class ArrayInsert {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int targetIndex = 2;
        System.out.println("삽입 전 배열 : " + Arrays.toString(arr));

        // 20이랑 30사이에 넣고 싶음
        int newData = 25; // 2번 인덱스에 넣어야 함

        // 1. 배열의 사이즈를 먼저 1 늘림
        int[] temp = new int[arr.length + 1];

        // 2. 원본배열 복사
        // 3. 맨 뒤부터 타겟인덱스까지 한칸씩 뒤로 민다.
        for (int i = arr.length - 1; i >= targetIndex; i--) {
            temp[i + 1] = arr[i];
        }
        for (int i = 0; i < targetIndex; i++) {
            temp[i] = arr[i];
        }

        // 4. 원하는 위치에 새 데이터를 넣는다.
        temp[targetIndex] = newData;

        // 5. 주소 이전
        arr = temp;
        temp = null;

        System.out.println("삽입 후 배열 : " + Arrays.toString(arr));
    }

}
