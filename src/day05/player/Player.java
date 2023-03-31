package day05.player;

public class Player {

    String nickname; // 캐릭터 닉네임
    int level; // 레벨
    int hp; // 체력

    // 생성자
    public Player(String nickname) {
        this(nickname, 1, 50);
        System.out.println("2번 생성자 호출");
    }

    public Player() {
        this("이름없음");
        System.out.println("1번 생성자 호출");
    }

    public Player(String nickname, int level, int hp) {
        this.nickname = nickname;
        this.level = level;
        this.hp = hp;
    }

    // 기능 - 메서드
    void attack(Player target) {

        if (this == target) return;

        // 맞은 녀석의 체력을 10 ~ 15 감소
        int damage = (int) (Math.random() * 6 + 10);
        target.hp -= damage;

        // 전투로그 출력
        // 가해자가 피해자를 공격해서 10 ~ 15 사이의 랜덤 피해를 입힘
        System.out.printf("%s님이 %s님을 공결해서 %d의 패해를 입힘!!\n", this.nickname, target.nickname, damage);
    }
}
