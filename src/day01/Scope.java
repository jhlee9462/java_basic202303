package day01;

public class Scope {

    public static void main(String[] args) {

        int userNumber = 1010;

        // 자바는 블록단위 스코프를 가짐
        int n1 = 10;
        int n2 = 20; // main 블록에서 생성된 변수

        if (true) {
            int n3 = n1 + n2;
            System.out.println(n3);
        } // end if
//        System.out.println(n3);

        int i;
        for (i = 0; i < 10; i++) {
            System.out.println(i);
        }
        int n4 = i;
    }

}
