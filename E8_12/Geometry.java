package E8_12;

import java.awt.geom.Point2D;

public class Geometry{
    public static double angle(Point2D.Double p, Point2D.Double q) {
        if (p.equals(q)) {
            throw new IllegalArgumentException("Points p and q are the same.");
        }

        double deltaX = q.getX() - p.getX();
        double deltaY = q.getY() - p.getY();

        double angleInRadians = Math.atan2(deltaY, deltaX);
        double angleInDegrees = Math.toDegrees(angleInRadians);

        // Ensure the angle is in the range [0, 360) degrees
        if (angleInDegrees < 0) {
            angleInDegrees += 360;
        }

        return angleInDegrees;
    }

    public static double slope(Point2D.Double p, Point2D.Double q) {
        if (p.equals(q)) {
            throw new IllegalArgumentException("Points p and q are the same.");
        }

        double deltaX = q.getX() - p.getX();
        double deltaY = q.getY() - p.getY();

        // Avoid division by zero for vertical lines
        if (deltaX == 0) {
            throw new ArithmeticException("The line is vertical (infinite slope).");
        }

        return deltaY / deltaX;
    }
}
