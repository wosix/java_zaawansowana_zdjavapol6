package calc;

public class Calculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        ByTwos byTwos = new ByTwos();
        ByFives byFives = new ByFives();

        System.out.println(calc.multiplyNumbers(1,8,1));
        System.out.println(calc.multiplyNumbers(1,8));
        System.out.println(calc.multiplyNumbers(8));


        System.out.println(byTwos.a);
        System.out.println(byTwos.getNext());
        System.out.println(byTwos.getNext());
        System.out.println(byTwos.getNext());

        byTwos.setStart(17);
        System.out.println(byTwos.getNext());
        System.out.println(byTwos.getNext());
        System.out.println(byTwos.getNext());

        byTwos.reset();
        System.out.println(byTwos.a);


        System.out.println(byFives.a);
        System.out.println(byFives.getNext());
        System.out.println(byFives.getNext());
        System.out.println(byFives.getNext());
        System.out.println(byFives.getNext());

        byFives.setStart(100);
        System.out.println(byFives.getNext());
        System.out.println(byFives.getNext());

        byFives.reset();
        System.out.println(byFives.a);
    }


    public int multiplyNumbers(int start, int end , int step){
        int wynik = 1;
        while (start < end) {
            wynik *= start;
            start += step;
        }
        return wynik;
    }

    int multiplyNumbers(int start, int end){
        int result = 1;
        for (int i = start; i < end; i++){
            result *= i;
        }
        return result;
    }

    int multiplyNumbers(int end){
        int result = 1;
        int start = 1;
        while (start < end){
            result *= start;
            start++;
        }
        return result;
    }
}
