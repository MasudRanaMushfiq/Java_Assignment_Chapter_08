package E8_7;

import java.util.Scanner;

public class Geometry {
    public static double cubeVolume(double h){
        double volume = Math.pow(h, 3);
        return volume;
    }
    public static double cubeSurface(double h){
        double surface = 6 * Math.pow(h, 2);
        return surface;
    }
    public static double sphereVolume(double r){
        double sVolume = (4/3) * Math.PI * Math.pow(r, 3);
        return sVolume;
    }
    public static double sphereSurface(double r){
        double sSurface = 4 * Math.PI * Math.pow(r,2);
        return sSurface;
    }
    public static double cylinderVolume(double r, double h){
        double cVolume = Math.PI * Math.pow(r, 2) * h;
        return cVolume;
    }
    public static double cylinderSurface(double r, double h){
        double cSurface = 2 * Math.PI * r * h;
        return  cSurface;
    }
    public static double coneVolume(double r, double h){
        double cVolume = Math.PI * r*r * (h/3);
        return cVolume;
    }
    public static double coneSurface(double r, double h){
    double cSurface = Math.PI * r*(r+ Math.sqrt(Math.pow(r,2) + Math.pow(h,2)));
    return cSurface;
    }



    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Please give a Radius: ");
        double radius = in.nextDouble();

        System.out.print("Please give a Height: ");
        double height = in.nextDouble();

        System.out.println("-----------------------------------------------------------");

        System.out.printf("Volume of a Cube: %20.2f\n", Geometry.cubeVolume(height));
        System.out.printf("Surface Area of a Cube: %14.2f\n", Geometry.cubeSurface(height));
        System.out.printf("Volume of a Sphere: %18.2f\n", Geometry.sphereVolume(radius));
        System.out.printf("Surface Area of a Sphere: %12.2f\n", Geometry.sphereSurface(radius));
        System.out.printf("Volume of a Cylinder: %16.2f\n", Geometry.cylinderVolume(radius, height));
        System.out.printf("Surface Area of a Cylinder: %10.2f\n", Geometry.cylinderSurface(radius, height));
        System.out.printf("Volume of a Cone: %20.2f\n", Geometry.coneVolume(radius, height));
        System.out.printf("Surface Area of a Cone: %14.2f\n", Geometry.coneSurface(radius, height));


    }

}
