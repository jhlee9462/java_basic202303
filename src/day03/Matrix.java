package day03;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        
        int korScore = 10;
        int mathScore = 20;
        int engScore = 30;

        int[] kimScores = {korScore, mathScore, engScore};
        int[] parkScores = {100, 34, 99};
        int[] hongScores = {10, 100, 11};
        
        int[][] studentScores = {kimScores, parkScores, hongScores};

        System.out.println(studentScores[0]);
        System.out.println(kimScores);

        System.out.println(studentScores[0][0]);
        System.out.println(kimScores[0]);

        System.out.println(Arrays.deepToString(studentScores));

        // 2차원배열의 값초기화
        int[][] arr2d = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90},
                {100, 200, 300},
        };

        System.out.println("==============");
        System.out.println(arr2d[1][2]);

        int[] arr3 = arr2d[2];
        System.out.println("Arrays.toString(arr3) = " + Arrays.toString(arr3));

        // 2차원 배열의 순회
        for (int[] arr :
                arr2d) {
            for (int n :
                    arr) {
                System.out.printf("%3d ", n);
            }
            System.out.println();
        }

        // 배열의 기본값
        // 정수배열은 0, 실수배열은 0.0 이 기본값, boolean 은 false, 객체는 null
        Scanner[] numbers = new Scanner[5];
        System.out.println("====================");
        System.out.println(Arrays.toString(numbers));

        // 5행 4열의 정수 2차원배열을 생성만하고 싶다.
        int[][] array2d = new int[5][4];

        // 2차원 배열의 수정
        array2d[1][3] = 99;
        array2d[2][1] = 55;
        array2d[3] = new int[] {9, 8, 7, 6};
        System.out.println("=================");
        for (int[] ints : array2d) {
            for (int anInt : ints) {
                System.out.printf("%2d ", anInt);
            }
            System.out.println();
        }

        // 3차원 배열
        int[][][] arr3d = {
                {
                        {10, 20},
                        {30, 40},
                        {50, 60},
                },
                {
                        {70, 80},
                        {90, 100},
                        {200, 300},
                },
                {
                        {400, 500},
                        {600, 700},
                        {800, 900},
                },
        };

        System.out.println(Arrays.deepToString(arr3d));

    }
    
}
