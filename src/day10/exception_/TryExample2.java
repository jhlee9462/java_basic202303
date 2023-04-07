package day10.exception_;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryExample2 {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("정수 1 : ");
            int n1 = sc.nextInt(); // InputMismatchException

            System.out.print("정수 2 : ");
            String strN2 = sc.next();
            int n2 = Integer.parseInt(strN2); // NumberFormatException

            int result = n1 / n2; // ArithmeticException
            System.out.println("result = " + result);
        } catch (InputMismatchException e) {
            System.out.println("첫 번째 숫자는 정수로만 입력해주세요");
        } catch (NumberFormatException e) {
            System.out.println("두 번째 숫자도 정수로만 입력해주세요");
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
    }
}
