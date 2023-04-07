package day10.exception_;

public class TryExample {

    public static void main(String[] args) {

        int n1 = 10, n2 = 5;

        System.out.println("나눗셈 시작!");

        // 예외 발생 가능성이 있는 코드 <- 예외처리
        try {
            System.out.printf("%d / %d = %d\n", n1, n2, n1 / n2);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
            // 개발시에 쓰는 코드 ( 로그 트레이싱 )
            e.printStackTrace();
        }

        System.out.println("프로그램 정상 종료");
    }
}
