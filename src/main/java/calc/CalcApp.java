package calc;

public class CalcApp {
    static Addition add = new Addition();
    static Multiplication multip = new Multiplication();
    static Expotentition exp = new Expotentition();

    public static void main(String[] args) {
        OperationsCalculator operations = new OperationsCalculator(add);
        System.out.println("------");
        System.out.println(operations.applyOperation(2,5));
        System.out.println(operations.applyOperation(4,5));

        operations.setOperation(multip);
        System.out.println("------");
        System.out.println(operations.applyOperation(2,5));
        System.out.println(operations.applyOperation(5,5));

        operations.setOperation(exp);
        System.out.println("------");
        System.out.println(operations.applyOperation(3,3));
        System.out.println(operations.applyOperation(2,8));
    }
}
