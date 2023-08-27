package E8_11;

import java.io.PrintStream;

public class GeometreEllipes {
    public double peremetreOfEllipes(double a, double b){
        double sum = 2*Math.PI* Math.sqrt((a*a+b*b)/2);
        return sum;
    }

    public  double areaOfEllipes(double a, double b){
        double num = Math.PI * a * b;
        return num;
    }

    public static void main(String[] args) {
        GeometreEllipes geometreEllipes = new GeometreEllipes();

        System.out.printf("Perimeter of Ellipse is:  %10.3f\n".formatted(geometreEllipes.peremetreOfEllipes(12, 45)));
        System.out.printf("Area of Ellipse is:  %10.3f\n".formatted(geometreEllipes.areaOfEllipes(12, 45)));

    }
}
