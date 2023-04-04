package day07.inherit;

public class Hunter extends Player {

    private int concentration; // 집중력

    public Hunter(String nickName) {
        super(nickName);
        this.concentration = 100;
    }

    public void summonBeast() {
        System.out.println("야수를 소환합니다.");
    }

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("# concentration : " + this.concentration);
    }
}
