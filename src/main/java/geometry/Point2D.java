package geometry;

public class Point2D {
    protected double x;
    protected double y;

    Point2D() {
        System.out.println("Empty Point2D constructor.");

        x = 0;
        y = 0;
    }

    Point2D(double x, double y) {
        String message = String.format("Constructing Point2D at [%f, %f]", x, y);
        System.out.println(message);

        this.x = x;
        this.y = y;
    }
}
