package E6_1_d;

import java.util.Scanner;

public class AllOddNUmber {
    public static void main(String[] args) {
        double sum = 0;
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        for(int one = a + 2; one<b; one = one + 2 ){
            if(one%2!=0) {
                sum = sum + one;
            }
        }

        System.out.println(sum);
    }
}
