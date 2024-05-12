public class Colleague2 implements Colleague {
    private Mediator mediator;

    public Colleague2(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sendMessage(String msg) {
        this.mediator.sendMessage(msg, this);
    }

    @Override
    public void receiveMessage(String msg) {
        System.out.println("Colleague 2 received msg: " + msg);
    }
}
