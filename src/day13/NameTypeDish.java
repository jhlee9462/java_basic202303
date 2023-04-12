package day13;

public class NameTypeDish {

    private final String name;
    public final Dish.Type type;

    public NameTypeDish(Dish dish) {
        this.name = dish.getName();
        this.type = dish.getType();
    }

    @Override
    public String toString() {
        return this.name + ": " + this.type;
    }
}
