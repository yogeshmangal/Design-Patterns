package Toppings;

import Pizza.BasePizza;

public class ExtraCheese implements ToppingDecorator {
    private BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int price() {
        return this.basePizza.price() + 50;
    }
}
