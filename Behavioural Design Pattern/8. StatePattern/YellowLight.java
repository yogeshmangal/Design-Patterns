public class YellowLight implements TrafficLightState {
    @Override
    public void handle() {
        System.out.println("Yellow Light: Cars should prepare to stop, pedestrians must wait.");
    }
}
