package generic;

public class NumberBox<T extends Number> extends Box<T>{

    boolean hasSameValue(NumberBox<?> otherBox){
        return otherBox.get().doubleValue() == this.get().doubleValue();
    }
}
