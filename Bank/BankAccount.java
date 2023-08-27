package Bank;
import static Constant.Constant.PERCENT;
import static Constant.Constant.ZERO;

/**
 * A bank Account Calculator.
 */

public class BankAccount {
    private double balance;
        public BankAccount(){
        balance = ZERO;
        }
    public BankAccount(double initialBalance){
            balance = initialBalance;
    }

    /**
     * Deposite Your Money.
      * @param amount
     */

    public void deposite(double amount){
            balance =  balance + amount;
    }

    public boolean withDraw(double amount){
            if(balance<amount){
                return false;
            }
            balance = balance - amount;
            return true;
    }

    public double getBalance(){
            return balance;
    }

    public void balanceTransfer(double amount){
        withDraw(amount);
    }
    public double calculateInterest(double interest){
        return balance*(interest/PERCENT);
    }

}
