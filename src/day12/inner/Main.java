package day12.inner;

public class Main {

    // 내부 클래스 (inner class)
    public static class SubCalculator implements Calculator {

        @Override
        public int operate(int n1, int n2) {
            return n1 - n2;
        }
    }

    public static void main(String[] args) {

        // 덧셈 계산을 하는 계산기를 만들어서 쓰고 싶다.
        Calculator addCalc = new AddCalculator();
        System.out.println(addCalc.operate(30, 50));

        // 뺄셈 계산을 하는 계산기가 필요
        Calculator sub1 = new SubCalculator();
        System.out.println(sub1.operate(100, 20));

        // 곱셈 계산을 하는 계산기가 필요 (익명 클래스)
        Calculator multCalc = new Calculator() {
            @Override
            public int operate(int n1, int n2) {
                return n1 * n2;
            }
        };
        System.out.println(multCalc.operate(2, 40));

        // 나눗셈을 하는 계산기 (람다)
        Calculator divCalc = (n1, n2) -> n1 / n2;
        System.out.println(divCalc.operate(50, 10));

    }
}
