package day10.generic;

public class AppleBasket {

    private Apple[] basket;

    public AppleBasket() {
        this.basket = new Apple[50];
    }

    public Apple[] getBasket() {
        return basket;
    }

    public void setBasket(Apple[] basket) {
        this.basket = basket;
    }
}
