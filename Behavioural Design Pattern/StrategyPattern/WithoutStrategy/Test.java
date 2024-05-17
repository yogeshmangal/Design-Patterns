package WithoutStrategy;

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

        /* Here we can see Bike and Scooty are Subclasses and they have the same code.
           Similarly, Car and Jeep are Subclasses and they have the same code. So to handle
           the redundant code, we will use the Strategy Pattern. */
    }
}
