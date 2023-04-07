package day10.exception_;

public class FinallyExample {

    public static void main(String[] args) {

        String[] pets = { "비둘기", "거북이", "앵무새" };

        for (int i = 0; i < 4; i++) {
            try {
                System.out.println(pets[i] + " 키울래요");
            } catch (Exception e) {
                System.out.println("애ㅐ완동물 정보가 없습니다.");
            } finally {
                // 예외와 관계없이 항상 실행할 코드
                System.out.println("애완동물 조아용~");
            }
        }
    }
}
