import Pizza.BasePizza;
import Pizza.Margherita;
import Pizza.VegDelight;
import Toppings.ExtraCheese;
import Toppings.Mushroom;

public class Test {
    public static void main(String[] args) {
        BasePizza pizza = new ExtraCheese(new VegDelight());
        System.out.println(pizza.price());

        BasePizza pizza2 = new Mushroom(new ExtraCheese(new Margherita()));
        System.out.println(pizza2.price());
    }
}
