package WithStrategy;

public class Jeep extends Vehicle {
    public Jeep() {
        super(new FourWheelerStrategy());
    }
}
