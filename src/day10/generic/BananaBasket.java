package day10.generic;

public class BananaBasket {

    private Banana[] basket;

    public BananaBasket() {
        this.basket = new Banana[50];
    }

    public Banana[] getBasket() {
        return basket;
    }

    public void setBasket(Banana[] basket) {
        this.basket = basket;
    }
}
