package day10.exception_;

import java.util.InputMismatchException;

public class ThrowsMain {

    public static void main(String[] args) {

        ThrowsExample te = new ThrowsExample();

        try {
            int n = te.inputNumber();
            int m = te.convert("100");
        } catch (InputMismatchException | NumberFormatException e) {
            System.out.println("오류 발생");
        }
    }
}
