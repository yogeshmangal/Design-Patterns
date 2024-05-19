package WithStrategy;

public class Scooty extends Vehicle {
    public Scooty() {
        super(new TwoWheelerStrategy());
    }
}
