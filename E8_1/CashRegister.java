package E8_1;

import static Constant.Constant.*;


public class CashRegister {

    public double purchase, payment;
    public CashRegister(){
        purchase = ZERO;
        payment = ZERO;
    }

    public double recordPurchase(double ... amounts){
        for(double amount : amounts)
        { purchase = purchase + amount;
        }
        return purchase;
    }


    public void receivePayment(double value){
        this.payment = this.payment + value;
    }

    public double change() {
        payment = payment - purchase;
        purchase = 0;
        return payment;
    }

}
