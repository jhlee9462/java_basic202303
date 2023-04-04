package test;

public class Main {

    public static void main(String[] args) {
        SnowTire snowTire = new SnowTire();
        Tire tire = snowTire;

        snowTire.roll();
        tire.roll();
    }
}
