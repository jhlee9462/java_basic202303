package day04;

import java.util.Scanner;

public class StringCompare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String myName = "홍길동";
        String inputName = sc.nextLine();

        if (myName == inputName)
            System.out.println("두 이름이 일치함!");
        else
            System.out.println("두 이름이 일치하지 않음!");

    }
}
