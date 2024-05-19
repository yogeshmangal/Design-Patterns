public class Test {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State1");
        originator.setState("State2");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State3");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State4");
        System.out.println("Current State: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }
}
