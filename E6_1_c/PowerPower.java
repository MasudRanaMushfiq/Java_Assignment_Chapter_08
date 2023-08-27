package E6_1_c;

public class PowerPower {
    public static void main(String[] args) {
        double sum = 0;

        for(int one = 0; one<=20; one++){
            sum = Math.pow(2, one);
            System.out.println("2^" + one + " is: " + sum);
        }


    }
}
