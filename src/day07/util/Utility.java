package day07.util;

import java.util.Scanner;

public class Utility {
    static private Scanner sc = new Scanner(System.in);

    // 구분선을 출력하는 기능
    public static void makeLine() {
        System.out.println("================================");
    }

    public static String input(String msg) {
        System.out.print(msg);
        return sc.nextLine();
    }

    // 생성자를 호출하지 않도록 막는다.
    private Utility() {}
}
