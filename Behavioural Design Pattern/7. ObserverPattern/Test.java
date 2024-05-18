public class Test {
    public static void main(String[] args) {
        Observable observable = new Observable();

        Observer observer1 = new ObserverImpl("Observer1");
        Observer observer2 = new ObserverImpl("Observer2");

        observable.addObserver(observer1);
        observable.addObserver(observer2);

        observable.setState("state1");
        observable.setState("state2");

        observable.removeObserver(observer1);
        observable.setState("state3");
    }
}
