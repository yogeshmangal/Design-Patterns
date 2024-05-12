public class MediatorImpl implements Mediator {
    private Colleague colleague1;
    private Colleague colleague2;

    public void setColleague1(Colleague colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(Colleague colleague2) {
        this.colleague2 = colleague2;
    }

    @Override
    public void sendMessage(String msg, Colleague colleague) {
        if (colleague == this.colleague1)
            this.colleague2.receiveMessage(msg);
        else if (colleague == this.colleague2)
            this.colleague1.receiveMessage(msg);
    }
}
