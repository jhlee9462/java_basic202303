package day08.poly.car;

public class CarShop {

    Car[] cars;
//    Mustang[] mustangs;
//    Stinger[] stingers;
//    Tuscon[] tuscons;

    // 대리점에 차를 입고하는 기능
    public void importCar() {
        cars = new Car[]{
                new Mustang(),
                new Mustang(),
                new Mustang(),
                new Stinger(),
                new Stinger(),
                new Stinger(),
                new Tuscon(),
                new Tuscon(),
                new Tuscon(),
        };

    }

    public CarShop() {
        importCar();
    }

    // 문자열과 정수와 논리를 배열에 담을 수 있는가?
    Object[] oArr = {
            50, 30, 3.3, "zzzz", true,
            new Mustang()
    };

    // 주행 테스트 가능
    public void runTest() {
        for (Car car : cars) {
            car.accelerate();
        }
    }

    // 차를 고객에게 인도하는 기능
    public Car exportCar(int money) {
        if (money == 6000)
            return new Mustang();
        else if (money == 5000)
            return new Stinger();
        else if (money == 3000)
            return new Tuscon();
        else
            return null;
    }
}
