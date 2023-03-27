package day01;

public class DataType {
    public static void main(String[] args) {
        int i = 30000;

        long money = 2147483648L;

        // float 4바이트 다운캐스팅
        float f1 = 1.23456789F;

        // soutv : 값 찍어보기
        System.out.println("f1 = " + f1);

        double d1 = 1.234314523463657546724;
        System.out.println("d1 = " + d1);

        // 논리타입
        boolean b1 = true;
        boolean b2 = false;
//        boolean b3 = 1;
//        boolean b3 = TRUE;

        // 문자 타입 : 한글자
        char c1 = 'A'; // 65
        System.out.println((char) (c1 + 1));

        char c2 = '핡';
        System.out.println("c2 = " + (int) c2);

        // 기본타입이 아니라 객체다
        String s = "hello";
        System.out.println("s = " + s);
    }
}
