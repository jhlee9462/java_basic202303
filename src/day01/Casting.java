package day01;

public class Casting {
    public static void main(String[] args) {
        byte a = 100;
        int b = a;

        int c = 1000;
        byte d = (byte) c;
        System.out.println("d = " + d);

        double x = 3.5566;
        int y = (int) x;
        System.out.println("y = " + y);

        // 타입이 다른 데이터의 연산
        // 큰 타입에 맞춰서 변환한 후 연산 진행
        int k = 100;
        double j = 5.5;

        double v = k + j;
        
        char c1 = 'A';
        byte alpha = 1;
        System.out.println("(c1 + alpha) = " + (c1 + alpha));

        // int 보다 작은테이터 (byte, short, char) 끼리의 연산은 무조건 둘 다 int 로 변환된다.

        char c2 = 'B';
        char c3 = 'a';
        System.out.println(c2 + c3);

        byte b1 = 100;
        byte b2 = 120;

        byte b3 = (byte) (b1 + b2);

        int g = 24;
        double result = g / 5;
        System.out.println("result = " + result);
    }
}
