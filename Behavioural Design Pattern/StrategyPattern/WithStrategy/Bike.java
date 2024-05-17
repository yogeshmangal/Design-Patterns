package WithStrategy;

public class Bike extends Vehicle {
    public Bike() {
        super(new TwoWheelerStrategy());
    }
}
