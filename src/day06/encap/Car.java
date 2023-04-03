package day06.encap;

public class Car {

    private String model; // 모델명
    private int speed; // 현재 속도
    private char mode; // 변속 모드 (D, N, R, P);
    private boolean start; // 시동 온 오프 상태

    // 생성자 : 객체가 처음 생성될 때 상태
    public Car(String model) {
        this.model = model;
        this.mode = 'P';
    }

    // setter: 필드값을 제어하기 위한 메서드
    public void setSpeed(int speed) {
        if (speed < 0 || speed > 200) return;
        this.speed = speed;
    }

    // getter: 필드값을 참조하기 위한 메서드
    public int getSpeed() {
        // 필드에는 km로 저장되어 이쓴ㄴ데
        // mile 변환해서 준다던가의 처리 가능.
        return speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public char getMode() {
        return mode;
    }

    public void setMode(char mode) {
        switch (mode) {
            case 'D': case 'R': case 'N': case 'P':
                this.mode = mode;
                return;
            default:
                this.mode = 'P';
        }
    }

    public boolean isStart() {
        return start;
    }

    public void setStart(boolean start) {
        this.start = start;
    }

    // 엔진에 연로가 주입되는 기능
    private void inject() {
        System.out.println("연로가 주입됩니다.");
    }

    // 엔진오일이 순환하는 기능
    private void cycleEngineOil() {
        System.out.println("엔진오일이 순환합니다.");
    }

    // 엔진 실린더가 움직이는 기능
    private void moveCylinder() {
        if (this.start) {
            System.out.println("실린더가 움직입니다.");
        } else {
            System.out.println("차가 폭발합니다.");
        }
    }

    // 시동버튼을 누르는 기능
    public void pressStartButton() {
        this.start = true;
        inject();
        cycleEngineOil();
        moveCylinder();
        System.out.println("시동이 걸렸습니다.");
    }
}
