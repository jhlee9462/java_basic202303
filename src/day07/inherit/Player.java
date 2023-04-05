package day07.inherit;

// 슈퍼 클래스 ( 부모 클래스 ) : 객체의 공통 기능과 속성을 설계

public class Player {

    private String nickName; // 캐릭터 이름
    private int level;
    private int hp;
    private int exp;

    public Player() {
        System.out.println("Player의 생성자 호출!");
    }

    public Player(String nickName) {
        this.nickName = nickName;
        this.level = 1;
        this.hp = 50;
    }

    // 캐릭터 상태창을 보는 기능
    public void showStatus() {
        System.out.println("\n========== Character's info =================");
        System.out.println("# name : " + this.nickName);
        System.out.println("# level : " + this.level);
        System.out.println("# hp : " + this.hp);
    }

    public String getNickName() {
        return nickName;
    }

    public void getDamage(int damage) {
        if (damage > this.hp) {
            this.hp = 0;
            System.out.println("사망했습니다.");
            return;
        }

        this.hp -= damage;
        System.out.println(this.nickName + "님이 " + damage + "의 피해를 입었습니다. ( 남은 체력 : " + this.hp + " ) ");
    }
}
