public class RedLight implements TrafficLightState {
    @Override
    public void handle() {
        System.out.println("Red Light: Cars must stop, pedestrians can cross.");
    }
}
