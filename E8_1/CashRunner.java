package E8_1;

import static Constant.Constant.*;

public class CashRunner {
    public static void main(String[] args) {
        Coin coin = new Coin(40.0,"Dime");
        CashRegister cashRegister = new CashRegister();

        cashRegister.recordPurchase(10.4, 10.6, 4, 5.5);
        cashRegister.recordPurchase(20.5);
        System.out.println("Total Purchase is: " + cashRegister.recordPurchase());

        cashRegister.receivePayment(90.8);
        cashRegister.receivePayment(coin.getaValue());

        System.out.println("Total Payment is: " + cashRegister.payment);

        Float change = (float)cashRegister.change();
        System.out.println("Change is: " + change);
    }



}
