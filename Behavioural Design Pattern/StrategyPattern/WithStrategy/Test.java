package WithStrategy;

public class Test {
    public static void main(String[] args) {
        Vehicle bike = new Bike();
        bike.drive();

        Vehicle scooty = new Scooty();
        scooty.drive();

        Vehicle car = new Car();
        car.drive();

        Vehicle jeep = new Jeep();
        jeep.drive();
    }
}
