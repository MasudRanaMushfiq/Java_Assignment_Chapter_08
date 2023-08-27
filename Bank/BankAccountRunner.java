package Bank;

public class BankAccountRunner {
    public static void main(String[] args) {
        BankAccount bankAccount2;
        BankAccount bankAccount =   new BankAccount();
        BankAccount bankAccount1 = new BankAccount(100);
        bankAccount2 = new BankAccount(200);

        bankAccount.deposite(300);
        bankAccount.balanceTransfer(100);
        Double interest = bankAccount.calculateInterest(5);
        boolean success = bankAccount.withDraw(100);
        System.out.println("Interest is: " + interest);
        System.out.println("Net Balance is: " + bankAccount.getBalance());
        //System.out.println(success);

    }
}
