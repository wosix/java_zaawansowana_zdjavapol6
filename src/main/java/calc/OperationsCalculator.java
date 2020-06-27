package calc;

public class OperationsCalculator {

    static MathematicalOperation operation;

    static Addition add = new Addition();
    static Multiplication multip = new Multiplication();
    static Expotentition exp = new Expotentition();


    OperationsCalculator(MathematicalOperation operation){
        this.operation = operation;
    }




    void setOperation(MathematicalOperation operation){
        OperationsCalculator operationsCalculator = new OperationsCalculator(operation);
    }

    double applyOperation(double x, double y){
        return operation.calculate(x, y);
    }
}
