package calc;

public class Expotentition implements MathematicalOperation {
    double result;

    public double calculate(double x, double y) {
        result = x;
        for (int i = 0; i < y - 1; i++) {
            result *= x;
        }
        return result;
    }
}
