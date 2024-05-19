package WithStrategy;

public class Vehicle {
    private Strategy strategy;

    public Vehicle(Strategy strategy) {
        this.strategy = strategy;
    }
    void drive() {
        this.strategy.drive();
    }
}
