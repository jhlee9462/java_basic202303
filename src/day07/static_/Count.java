package day07.static_;

public class Count {

    // 제한자 ( modifier )
    // 접근 제한자 ( access ), 사용 제한자 ( Usage )
    public static int x; // 정적 필드, 모든 객체가 공유
    public int y;               // 인스턴스 필드

    // 정적 메서드
    public static void m1() {
        System.out.println("static 메서드 호출");
        // 핃드 참조
        System.out.println("x = " + x);
//        System.out.println("y = " + y); // 참조 불가
    }
    // 인스턴스 메서드
    public void m2() {
        System.out.println("instance 메서드 호출");
    }

}
