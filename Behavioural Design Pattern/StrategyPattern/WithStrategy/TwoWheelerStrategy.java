package WithStrategy;

public class TwoWheelerStrategy implements Strategy{
    @Override
    public void drive() {
        System.out.println("Two Wheeler Vehicle");
    }
}
