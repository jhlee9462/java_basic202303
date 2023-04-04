package day07.lotto;

import java.text.NumberFormat;
import java.util.HashSet;
import java.util.Set;

import static day07.util.Utility.input;
import static java.lang.Math.random;

public class Lotto {

    private static Set<Integer> luckyNumbers;

    private Lotto() {}

    public static void information() {

        Set<Integer> numbers = new HashSet<Integer>();

        while (numbers.size() < 6) {
            numbers.add((int) (random() * 45) + 1);
        }

        System.out.println(numbers);
    }

    public static void run() {
        checkLottery(buyLottery());
    }

    public static void checkLottery(Set<Integer> buyerLottery) {
        int tryCount = 1;
        Long totalCost = 5000L;

        while (true) {
            makeLuckyNumbers();
            if (luckyNumbers.equals(buyerLottery)) {
                System.out.printf("%d장만에 1등에 당첨되었습니다. ㅊㅋㅊㅋ\n", tryCount);
                break;
            }

            System.out.printf("%s장째 구매중... ㅜㅜ | 총 소요 금액 : %d원 | 당첨 숫자 : %s\n", NumberFormat.getInstance().format(tryCount++), totalCost, luckyNumbers);
            totalCost += 5000;
        }
    }

    public static void makeLuckyNumbers() {
        // 기존의 배열을 초기화
        luckyNumbers = new HashSet<>();

        while (luckyNumbers.size() < 6)
            luckyNumbers.add((int) (random() * 45) + 1);
    }

    public static Set<Integer> buyLottery() {
        Set<Integer> buyerNumbers = new HashSet<>();

        System.out.println("6 개의 번호를 차례대로 입력하세요");

        for (int i = 1; buyerNumbers.size() < 6;) {
            int buyerNumber = Integer.parseInt(input(String.format("%d번째 번호를 입력하세요 >> ", i)));

            if (buyerNumbers.contains(buyerNumber)) {
                System.out.println("# 중복번호입니다.");
                continue;
            }

            if (buyerNumber < 1 || buyerNumber > 45) {
                System.out.println("# 올바른 숫자를 입력해 주세요");
                continue;
            }

            buyerNumbers.add(buyerNumber);
            ++i;
        }

        return buyerNumbers;
    }
}
