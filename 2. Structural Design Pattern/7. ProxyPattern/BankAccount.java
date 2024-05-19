public class BankAccount implements Bank {

    @Override
    public void withDraw() {
        System.out.println("Money withdraw successfully");
    }

    @Override
    public void getAccountNumber() {
        System.out.println("Your Account Number is: ABCD12345");
    }
}
