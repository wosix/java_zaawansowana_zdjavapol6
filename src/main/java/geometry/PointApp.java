package geometry;

public class PointApp {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();

        Point3D point3D1 = new Point3D(2, 3, 4);

        Rectangle rectangle = new Rectangle(3, 8);

        Triangle triangle = new Triangle(5, 3);


        rectangle.printDimensions();

        System.out.println("Rectangle area: " + rectangle.getArea());

        triangle.printDimensions();
        System.out.println("Triangle area: " + triangle.getArea());

    }
}
