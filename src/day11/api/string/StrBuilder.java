package day11.api.string;

public class StrBuilder {

    private static void makeString() {

        long time1 = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 500000; i++) {
            s += "A";
        }
        long time2 = System.currentTimeMillis();

        System.out.println("총 걸린 시간 = " + (time2 - time1) + "밀리초");
    }

    private static void makeStringBuilder() {

        long time1 = System.currentTimeMillis();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 500000; i++) {
            s.append("A");
        }
        long time2 = System.currentTimeMillis();

        System.out.println("총 걸린 시간 = " + (time2 - time1) + "밀리초");
    }

    public static void main(String[] args) {

        makeStringBuilder();
        makeString();

        Integer a = 10; // 오토 박싱
        Character c = 'A';
        Byte b = 1;

    }
}
