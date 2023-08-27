package String;

import java.util.Scanner;

public class Initial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your First Name: ");
        String first = in.next();
        System.out.println("Enter your significant other's first name: ");
        String last = in.next();

        System.out.println("Your Name is: " + first + " " + last);
        String initial = first.substring(0,1) + "&" + last.substring(0,1);
        System.out.println(initial);
    }
}
