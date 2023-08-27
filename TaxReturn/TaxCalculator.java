package TaxReturn;
import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter Your Income");
        double income = in.nextDouble();

        System.out.print("Are you married? (YES/NO) ");
        String input = in.next();
            int status;
                if (input.equals("YES")){
                status = TaxReturn.MARRIED;
                 }else{
                status = TaxReturn.SINGLE;
                }
        TaxReturn aTaxReturn = new TaxReturn(income, status);
        System.out.println("Tax: " + aTaxReturn.getTax());
    }

}
