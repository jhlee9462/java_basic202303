package day10.exception_;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsExample {

    /**
     * 정수를 입력받아서 리턴하는 메서드
     * @return : 입력받은 정수
     */
    public int inputNumber() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    /**
     * 문자열을 정수로 치환하는 메서드
     * @param s : 문자열
     * @return : 정수
     */
    public int convert(String s) throws NumberFormatException {
        return Integer.parseInt(s);
    }
}
