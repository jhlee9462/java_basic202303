package day07.inherit;

public class Mage extends Player {
    private int mana; // 마력 게이지

    public Mage(String nickName) {
        super(nickName);
        this.mana = 100;
    }

    // 썬더볼트
    public void thunderVolt() {
        System.out.println("썬더볼트를 사용합니다.");
    }

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("# mana : " + this.mana);
    }
}
