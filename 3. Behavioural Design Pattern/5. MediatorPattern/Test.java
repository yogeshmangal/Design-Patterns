public class Test {
    public static void main(String[] args) {
        MediatorImpl mediator = new MediatorImpl();
        Colleague colleague1 = new Colleague1(mediator);
        Colleague colleague2 = new Colleague2(mediator);

        mediator.setColleague1(colleague1);
        mediator.setColleague2(colleague2);

        colleague1.sendMessage("Hi from Colleague1");
        colleague2.sendMessage("Hey from Colleague2");
    }
}
