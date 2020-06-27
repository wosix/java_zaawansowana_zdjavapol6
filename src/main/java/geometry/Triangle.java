package geometry;

public class Triangle extends FlatShape{

    Triangle(double x, double y){
        super(x, y);
    }

    @Override
    double getArea() {
        return x * y;
    }
}
