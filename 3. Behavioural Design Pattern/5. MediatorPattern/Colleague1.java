public class Colleague1 implements Colleague {
    private Mediator mediator;
    public Colleague1(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sendMessage(String msg) {
        this.mediator.sendMessage(msg, this);
    }

    @Override
    public void receiveMessage(String msg) {
        System.out.println("Colleague 1 received msg: " + msg);
    }
}
