package generic;

public class BoxApp {

    public static void main(String[] args) {


        Box<Integer> integerBox = new Box<>();
        integerBox.set(134);




        Box<String> strBox = new Box<>();
        strBox.set("Hello world!");
        System.out.println(integerBox.get());

//        Box box = new Box();
//        box.set("Text");
//        Object object = box.get();
//        String text = (String) object;   <-  UNIKAC TEGO!!!


        integerBox.exampleGenericMethod(1234);

    }
}
