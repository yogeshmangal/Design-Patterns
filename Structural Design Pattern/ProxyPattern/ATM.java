public class ATM implements Bank {

    @Override
    public void withDraw() {
        Bank bank = new BankAccount();
        bank.withDraw();
    }

    @Override
    public void getAccountNumber() {
        Bank bank = new BankAccount();
        bank.getAccountNumber();
    }
}
