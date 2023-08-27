package E6_1_a;

public class SomeOfEven {
    public static void main(String[] args) {
        int sum = 0;

        for(int one = 4; one < 100; one = one + 2 ){
            sum = sum + one;
        }
        System.out.println(sum);

    }
}
