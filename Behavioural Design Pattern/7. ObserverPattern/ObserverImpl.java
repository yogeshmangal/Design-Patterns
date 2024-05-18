public class ObserverImpl implements Observer {
    private String name;

    public ObserverImpl(String name) {
        this.name = name;
    }

    @Override
    public void update(String state) {
        System.out.println(this.name + " received update: " + state);
    }
}
