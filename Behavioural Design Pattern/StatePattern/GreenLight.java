public class GreenLight implements TrafficLightState {
    @Override
    public void handle() {
        System.out.println("Green Light: Cars can go, pedestrians must wait.");
    }
}
