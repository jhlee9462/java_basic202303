package day08.poly.car;

import static day07.util.Utility.makeLine;

public class Main {

    public static void main(String[] args) {
        CarShop carShop = new CarShop();

        carShop.runTest();

        makeLine();

        Driver park = new Driver();

        park.drive(new Mustang());

        makeLine();

        Car mustang = new Mustang();
        mustang.accelerate();
        ((Mustang) mustang).powerSound();

        Stinger stinger = new Stinger();
        stinger.accelerate();
//        stinger.powerSound(); // 불가

        makeLine();

        Car car = carShop.exportCar(6000);

        System.out.println(car instanceof Stinger);
        System.out.println(car instanceof Tuscon);
        System.out.println(car instanceof Mustang);
//        System.out.println("car = " + car);
    }
}
