public class Context {
    private TrafficLightState trafficLightState;

    public Context(TrafficLightState trafficLightState) {
        this.trafficLightState = trafficLightState;
    }

    public void setState(TrafficLightState trafficLightState) {
        this.trafficLightState = trafficLightState;
    }

    public void handle() {
        this.trafficLightState.handle();
    }
}
