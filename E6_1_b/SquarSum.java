package E6_1_b;

public class SquarSum {
    public static void main(String[] args) {
        double sum = 0;
        double count = 0;

        while(count<100){
           int one = 2;
               count = count + Math.pow(one, 2);
                one++;
              //System.out.println(count);

           sum = sum + count;
       }
        System.out.println(sum - 100);

    }
}
