package E8_8;

import java.util.Scanner;

public class GeometryClass {
     static class CubeVolume{
        public double cubeVolume ( double h){
        double volume = Math.pow(h, 3);
        return volume;
      }
    }
    static class CubeSurface{
        public static double cubeSurface(double h){
            double surface = 6 * Math.pow(h, 2);
            return surface;
        }
    }

    static class SphereVolume{
        public static double sphereVolume(double r){
            double sVolume = (4/3) * Math.PI * Math.pow(r, 3);
            return sVolume;
        }
    }

    static class SphereSurface{
        public static double sphereSurface(double r){
            double sSurface = 4 * Math.PI * Math.pow(r,2);
            return sSurface;
        }
    }

    static class CylinderVolume{
        public static double cylinderVolume(double r, double h){
            double cVolume = Math.PI * Math.pow(r, 2) * h;
            return cVolume;
        }
    }

    static class CylinderSurface{
        public static double cylinderSurface(double r, double h){
            double cSurface = 2 * Math.PI * r * h;
            return  cSurface;
        }
    }

    static class ConeVolume{
        public static double coneVolume(double r, double h){
            double cVolume = Math.PI * r*r * (h/3);
            return cVolume;
        }
    }

    static class ConeSurface{
        public static double coneSurface(double r, double h){
            double cSurface = Math.PI * r*(r+ Math.sqrt(Math.pow(r,2) + Math.pow(h,2)));
            return cSurface;
        }
    }

    public static void main(String[] args) {
        CubeVolume cubeVolume = new CubeVolume();
        CubeSurface cubeSurface = new CubeSurface();
        SphereVolume sphereVolume = new SphereVolume();
        SphereSurface sphereSurface = new SphereSurface();
        CylinderVolume cylinderVolume = new CylinderVolume();
        CylinderSurface cylinderSurface = new CylinderSurface();
        ConeVolume coneVolume = new ConeVolume();
        ConeSurface coneSurface = new ConeSurface();


        Scanner in = new Scanner(System.in);

        System.out.print("Please give a Radius: ");
        double radius = in.nextDouble();

        System.out.print("Please give a Height: ");
        double height = in.nextDouble();

        System.out.println("---------------------------------------------------------");

        System.out.printf("Volume of a Cube: %20.2f\n", cubeVolume.cubeVolume(height));
        System.out.printf("Surface Area of a Cube: %14.2f\n", CubeSurface.cubeSurface(height));
        System.out.printf("Volume of a Sphere: %18.2f\n", SphereVolume.sphereVolume(radius));
        System.out.printf("Surface Area of a Sphere: %12.2f\n", SphereSurface.sphereSurface(radius));
        System.out.printf("Volume of a Cylinder: %16.2f\n", CylinderVolume.cylinderVolume(radius, height));
        System.out.printf("Surface Area of a Cylinder: %10.2f\n", CylinderSurface.cylinderSurface(radius, height));
        System.out.printf("Volume of a Cone: %20.2f\n", ConeVolume.coneVolume(radius, height));
        System.out.printf("Surface Area of a Cone: %14.2f\n", ConeSurface.coneSurface(radius, height));

    }

}
