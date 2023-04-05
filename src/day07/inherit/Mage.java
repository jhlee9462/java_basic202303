package day07.inherit;

import static java.lang.Math.random;

public class Mage extends Player {
    private int mana; // 마력 게이지

    public Mage(String nickName) {
        super(nickName);
        this.mana = 100;
    }

    // 썬더볼트
    public void thunderVolt(Player... targets) {
        System.out.printf("%s님 썬더볼트를 시전!!", super.getNickName());
        for (Player target : targets) {
            if (target.equals(this))
                continue;

            target.getDamage((int) (random() * 6) + 10);
        }
    }

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("# mana : " + this.mana);
    }
}
