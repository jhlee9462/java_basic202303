package day09.quiz;

public class IPhone extends SmartPhone {

    public IPhone(String model) {
        super(model);
    }

    @Override
    public String information() {
        return "아이폰은 " + super.getModel() + "에서 만들어졌고 제원은 다음과 같다.\n" +
                makeCall() +
                takeCall() +
                takePicture() +
                charge() +
                touchDisplay();
    }

    @Override
    public String charge() {
        return "고속충전, 고속 무선 충전\n";
    }

    @Override
    public String makeCall() {
        return "번호를 누르고 통화버튼을 누름\n";
    }

    @Override
    public String takeCall() {
        return "전화받기 버튼을 누름\n";
    }

    @Override
    public String takePicture() {
        return "1200만 1600만 트리플 카메라\n";
    }

    @Override
    public String touchDisplay() {
        return "정전식\n";
    }
}
