package geometry;

public class Point3D extends Point2D {
    double z;

    public Point3D() {
        super();
        z = 0;
        System.out.println("Empty Point3D consructor.");
    }

    Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;

        System.out.println("Parametric Point3D consructor.");
    }

}
