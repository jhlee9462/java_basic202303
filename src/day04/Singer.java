package day04;

public class Singer {

    private String singerName;

    // 매개변수가 없는 생성자를 기본 생성자
    // 클래스 안에서 생성자가 하나도 없을 경우 자동 생성
    public Singer() {
    }

    public Singer(String singerName) {
        this.singerName = singerName;
    }
}
