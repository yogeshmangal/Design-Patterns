package Toppings;

import Pizza.BasePizza;

public class Mushroom implements ToppingDecorator {
    private BasePizza basePizza;

    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int price() {
        return this.basePizza.price() + 100;
    }
}
