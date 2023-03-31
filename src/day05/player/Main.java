package day05.player;

public class Main {

    public static void main(String[] args) {

        Player parking = new Player("주차왕파킹");
        Player gondue = new Player("딸긔겅듀");
        Player noName = new Player();

        gondue.attack(parking);
        System.out.println("parking.hp = " + parking.hp);
    }
}
